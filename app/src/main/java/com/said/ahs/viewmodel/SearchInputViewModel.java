package com.said.ahs.viewmodel;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;

import com.said.ahs.model.mapper.SearchCardsDataToApp;
import com.said.ahs.view.SearchInputView;
import com.said.data.api.queries.SearchQuery;
import com.said.data.cache.CardsCacheImp;
import com.said.data.model.SearchCards;
import com.said.data.repository.CardsRepositoryImp;
import com.said.data.repository.datasource.CardsStoreFactory;

import eu.inloop.viewmodel.AbstractViewModel;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Said on 20/8/15.
 */
public class SearchInputViewModel extends AbstractViewModel<SearchInputView> {

    private String value_search;
    private String path_search;
    private Context context;
    private final String KEY_PATH_BUNDLE = "value";
    private final String KEY_VALUE_BUNDLE = "path";

    @Override
    public void onCreate(@Nullable Bundle arguments,@Nullable Bundle savedInstanceState) {
        super.onCreate(arguments, savedInstanceState);

        if(value_search != null ){
            savedInstanceState.getString(KEY_VALUE_BUNDLE);
        }
        if(path_search != null){
            savedInstanceState.get(KEY_PATH_BUNDLE);
        }

    }

    public void injectSearchPathTypeValues(String value_search, String path_search){
        this.path_search = path_search;
        this.value_search = value_search;

    }

    public void injectApplicationContext(Context context){
        this.context = context;
    }

    @Override
    public void bindView(@NonNull SearchInputView view) {
        super.bindView(view);

        view.showTypeSearchText(value_search);


    }

    public void doSearch(SearchQuery searchQuery){
        CardsRepositoryImp cardsRepositoryImp = new CardsRepositoryImp(new CardsStoreFactory(new CardsCacheImp(context)));

        cardsRepositoryImp.getCards(this.path_search, this.value_search, searchQuery.generateQueryMap())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(new Subscriber<SearchCards>() {
                @Override
                public void onCompleted() {
                    getView().showData();
                }

                @Override
                public void onError(Throwable e) {

                    Log.e("ERROR", "INEXPERADO");
                }

                @Override
                public void onNext(SearchCards cards) {
                    SearchCardsDataToApp searchCardsDataToApp = new SearchCardsDataToApp();
                    getView().retrieveData(searchCardsDataToApp.transform(cards));
                }
            });
    }


    @Override
    public void saveState(Bundle bundle) {
        super.saveState(bundle);

        if(this.path_search != null){
            bundle.putString(KEY_PATH_BUNDLE, this.path_search);
        }
        if(this.value_search != null){
            bundle.putString(KEY_VALUE_BUNDLE, this.value_search);
        }

    }

    @Override
    public void onModelRemoved() {
        super.onModelRemoved();
    }
}
