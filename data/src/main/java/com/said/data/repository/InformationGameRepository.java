package com.said.data.repository;

import com.said.data.repository.datasource.InformationDataStore;
import com.said.data.repository.datasource.InformationDataStoreFactory;

import java.util.List;

import rx.Observable;

/**
 * Created by Said on 18/8/15.
 */
public class InformationGameRepository implements InformationRepository {

    private InformationDataStoreFactory informationDataStoreFactory;

    public InformationGameRepository(InformationDataStoreFactory informationDataStoreFactory) {
        this.informationDataStoreFactory = informationDataStoreFactory;
    }

    @Override
    public Observable<List<String>> getClasses() {
        final InformationDataStore informationDataStore = informationDataStoreFactory.create();
        return informationDataStore.getClasses();
    }

    @Override
    public Observable<List<String>> getRaces() {
        final InformationDataStore informationDataStore = informationDataStoreFactory.create();
        return informationDataStore.getRaces();
    }

    @Override
    public Observable<List<String>> getTypes() {
        final InformationDataStore informationDataStore = informationDataStoreFactory.create();
        return informationDataStore.getTypes();
    }

    @Override
    public Observable<List<String>> getLanguages() {
        final InformationDataStore informationDataStore = informationDataStoreFactory.create();
        return informationDataStore.getLanguages();
    }

    @Override
    public Observable<List<String>> getQualities() {
        final InformationDataStore informationDataStore = informationDataStoreFactory.create();
        return informationDataStore.getQualities();
    }

    @Override
    public Observable<List<String>> getSets() {
        final InformationDataStore informationDataStore = informationDataStoreFactory.create();
        return informationDataStore.getSets();
    }

    @Override
    public Observable<List<String>> getFactions() {
        final InformationDataStore informationDataStore = informationDataStoreFactory.create();
        return informationDataStore.getFactions();
    }

    @Override
    public Observable<String> getPatch() {
        final InformationDataStore informationDataStore = informationDataStoreFactory.create();
        return informationDataStore.getPatch();
    }
}
