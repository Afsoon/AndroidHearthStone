package com.said.data.repository;

import com.said.data.model.SearchCards;
import com.said.data.repository.datasource.CardsStore;
import com.said.data.repository.datasource.CardsStoreFactory;

import java.util.Map;

import rx.Observable;

/**
 * Created by Said on 20/8/15.
 */
public class CardsRepositoryImp implements CardsRepository {

    private CardsStoreFactory cardsStoreFactory;

    public CardsRepositoryImp(CardsStoreFactory cardsStoreFactory) {
        this.cardsStoreFactory = cardsStoreFactory;
    }

    @Override
    public Observable<SearchCards> getCards(String type_search, String value, Map<String, String> querymap) {
        final CardsStore cardsStore = cardsStoreFactory.create(value, querymap);
        return cardsStore.getCards(type_search, value, querymap);
    }
}
