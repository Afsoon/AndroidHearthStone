package com.said.data.repository.datasource;

import com.said.data.cache.CardsCache;
import com.said.data.model.SearchCards;

import java.util.Map;

import rx.Observable;

/**
 * Created by Said on 20/8/15.
 */
public class CacheCardsStore implements CardsStore {

    private CardsCache cardsCache;

    public CacheCardsStore(CardsCache cardsCache) {
        this.cardsCache = cardsCache;
    }

    @Override
    public Observable<SearchCards> getCards(String type_search, String value, Map<String,String> querymap) {
        if (querymap.size() == 0){
            return cardsCache.getCard(value.toLowerCase());
        }else{
            return cardsCache.getCard(value.toLowerCase()+querymap.toString().toLowerCase());
        }
    }
}
