package com.said.ahs.viewmodel;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.said.data.cache.InformationGameCache;
import com.said.data.cache.InformationGameCacheImp;
import com.said.data.model.Info;
import com.said.data.api.HearthStoneManager;
import com.said.ahs.view.GameInformationRecyclerView;

import java.util.ArrayList;
import java.util.List;

import eu.inloop.viewmodel.AbstractViewModel;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Said on 16/8/15.
 */
public class GameInformationViewModel extends AbstractViewModel<GameInformationRecyclerView> {

    private List<String> gameInformation;
    private Context context;
    private InformationGameCache informationGame;
    private Info information;


    private boolean isNotFinished;

    @Override
    public void onCreate(@Nullable Bundle arguments, @Nullable Bundle savedInstanceState) {
        super.onCreate(arguments, savedInstanceState);

        //this will be only not null in case the application was killed due to low memory
        if (savedInstanceState != null) {
            gameInformation = savedInstanceState.getStringArrayList("userlist");
        }
    }

    @Override
    public void bindView(@NonNull GameInformationRecyclerView view) {
        super.bindView(view);

        //downloading list of users
        if (gameInformation != null) {
            view.showInfoGame(gameInformation);
        } else if (isNotFinished) {
            view.showLoading();
        } else {
            loadInfo();
        }
    }

    public void injectApplicationContext(Context context){
        this.context = context;
    }

    private void loadInfo(){
        isNotFinished = true;
        if(getView() != null){
            getView().showLoading();
        }

        HearthStoneManager hearthStoneManager = new HearthStoneManager();

        hearthStoneManager.getInfo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Info>() {
                    private Info fill;
                    @Override
                    public void onCompleted() {
                        isNotFinished = false;
                        if(getView() != null){
                            getView().hideLoading();
                            getView().showInfoGame(gameInformation);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        isNotFinished = false;
                        if(getView() != null){
                            getView().hideLoading();
                            getView().showInfoGame(new ArrayList<String>());
                        }
                    }

                    @Override
                    public void onNext(Info info) {
                        putOptions();
                        informationGame = new InformationGameCacheImp(context);
                        informationGame.put(info);
                        information = info;
                    }
                });

    }

    public List<String> getGameInformation(int position){
        //InformationGameRepository informationGameRepository = new InformationGameRepository(new InformationDataStoreFactory(context, new InformationGameCacheImp(context)));
        switch (position){
            case 0:
                return information.getClasses();
            case 1:
                return information.getRaces();
            case 2:
                return information.getFactions();
            case 3:
                return information.getTypes();
            case 4:
                return information.getQualities();
            case 5:
                return information.getSets();
        }
        return null;
    }

    private void putOptions(){
        gameInformation = new ArrayList<>();
        gameInformation.add("Buscar por clase cartas");
        gameInformation.add("Buscar por raza cartas");
        gameInformation.add("Buscar por facción cartas");
        gameInformation.add("Buscar por tipo cartas");
        gameInformation.add("Buscar por rareza cartas");
        gameInformation.add("Buscar por conjunto de cartas");
    }


    @Override
    public void saveState(Bundle bundle) {
        super.saveState(bundle);
        if (gameInformation != null) {
            bundle.putStringArrayList("userlist", new ArrayList<>(gameInformation));
        }
    }

    @Override
    public void onModelRemoved() {
        super.onModelRemoved();
        //use this to cancel any planned requests
    }
}
