package com.said.data.repository.datasource;

import com.said.data.model.SearchCards;

import java.util.Map;

import rx.Observable;

/**
 * Created by Said on 20/8/15.
 */
public interface CardsStore {

    Observable<SearchCards> getCards(String type_search, String value, Map<String, String> querymap);
}
