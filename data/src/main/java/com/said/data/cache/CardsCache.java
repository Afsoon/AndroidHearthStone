package com.said.data.cache;

import com.said.data.model.SearchCards;

import rx.Observable;

/**
 * Created by Said on 15/8/15.
 */
public interface CardsCache {

    Observable<SearchCards> getCard(String key);

    void putNew(String key, SearchCards value);

    boolean isCached(String key);

}
