package com.said.data.cache;

import android.content.Context;

import com.said.data.model.CardsJSON;
import com.said.data.model.SearchCards;
import com.said.data.model.SearchCardsCache;
import com.vincentbrison.openlibraries.android.dualcache.lib.DualCache;
import com.vincentbrison.openlibraries.android.dualcache.lib.DualCacheBuilder;
import com.vincentbrison.openlibraries.android.dualcache.lib.DualCacheContextUtils;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by Said on 20/8/15.
 */
public class CardsCacheImp implements  CardsCache {

    private DualCache<SearchCardsCache> cardsDualCache;
    private final String CACHE_NAME = "CARDS";
    private final int VERSION = 2;
    private final int CACHE_SIZE_RAM = 4 * 1024 * 1024; // 4 MiB
    private final int CACHE_SIZE_DISK = CACHE_SIZE_RAM * 10; // 40 MiB


    public CardsCacheImp(Context context) {
        DualCacheContextUtils.setContext(context);
        cardsDualCache = new DualCacheBuilder<>(CACHE_NAME,VERSION, SearchCardsCache.class)
                .useDefaultSerializerInRam(CACHE_SIZE_RAM)
                .useDefaultSerializerInDisk(CACHE_SIZE_DISK,true);
    }

    @Override
    public synchronized Observable<SearchCards> getCard(final String key) {
        return Observable.create(new Observable.OnSubscribe<SearchCards>() {
            @Override
            public void call(Subscriber<? super SearchCards> subscriber) {
                SearchCardsCache searchCardsCache = cardsDualCache.get(key);
                SearchCards searchCards = new SearchCards(searchCardsCache.getCardsJSONList());
                if(searchCards != null){
                    subscriber.onNext(searchCards);
                    subscriber.onCompleted();
                }else{
                    subscriber.onError(new Exception("No hay elementos"));
                }
            }
        });
    }

    @Override
    public synchronized void putNew(String key, SearchCards value) {
        SearchCardsCache searchCardsCache = new SearchCardsCache(value.getCardsJSONList());
        cardsDualCache.put(key,searchCardsCache);
    }

    @Override
    public boolean isCached(String key) {
        return cardsDualCache.get(key) != null;
    }
}
