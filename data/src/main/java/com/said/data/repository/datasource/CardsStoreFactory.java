package com.said.data.repository.datasource;


import com.said.data.api.HearthStoneManager;
import com.said.data.cache.CardsCache;

import java.util.Map;

/**
 * Created by Said on 20/8/15.
 */
public class CardsStoreFactory {

    private CardsCache cardsCache;

    public CardsStoreFactory(CardsCache cardsCache) {
        if(cardsCache == null ){
            throw new IllegalArgumentException("Cache cant be null");
        }

        this.cardsCache = cardsCache;
    }

    public CardsStore create(String value, Map<String, String> querymap){
        CardsStore cardsStore;

        boolean cached;
        if(querymap.size() == 0){
            cached = cardsCache.isCached(value.toLowerCase());
        }else{
            cached = cardsCache.isCached(value.toLowerCase()+querymap.toString().toLowerCase());
        }

        if(cached){
            cardsStore = new CacheCardsStore(cardsCache);
        }else{
            cardsStore = createCloud();
        }

        return cardsStore;
    }

    private CardsStore createCloud(){
        HearthStoneManager hearthStoneManager = new HearthStoneManager();
        return new CloudCardsStore(hearthStoneManager,cardsCache);
    }
}
