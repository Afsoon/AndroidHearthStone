package com.said.data.repository.datasource;

import com.said.data.api.HearthStoneManager;
import com.said.data.cache.CardsCache;
import com.said.data.model.SearchCards;

import java.util.Map;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Said on 20/8/15.
 */
public class CloudCardsStore implements CardsStore {

    private HearthStoneManager hearthStoneManager;
    private CardsCache cardsCache;



    public CloudCardsStore(HearthStoneManager hearthStoneManager, CardsCache cardsCache) {
        this.hearthStoneManager = hearthStoneManager;
        this.cardsCache = cardsCache;
    }

    @Override
    public Observable<SearchCards> getCards(String type_search, final String value, final Map<String, String> querymap) {
        return hearthStoneManager.searchCards(type_search, value, querymap)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(new Action1<SearchCards>() {
                    @Override
                    public void call(SearchCards searchCards) {
                        if (querymap.size() == 0){
                            cardsCache.putNew(value.toLowerCase(),searchCards);
                        }else{
                            cardsCache.putNew(value.toLowerCase()+querymap.toString().toLowerCase(),searchCards);
                        }

                    }
                });
    }
}
