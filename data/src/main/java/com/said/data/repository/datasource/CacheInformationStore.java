package com.said.data.repository.datasource;

import com.said.data.cache.InformationGameCache;

import java.util.List;

import rx.Observable;

/**
 * Created by Said on 18/8/15.
 */
public class CacheInformationStore implements InformationDataStore {

    private InformationGameCache informationGameCache;

    public CacheInformationStore(InformationGameCache informationGameCache) {
        this.informationGameCache = informationGameCache;
    }

    @Override
    public Observable<List<String>> getClasses() {
        return this.informationGameCache.getClasses();
    }

    @Override
    public Observable<List<String>> getRaces() {
        return this.informationGameCache.getRaces();
    }

    @Override
    public Observable<List<String>> getTypes() {
        return this.informationGameCache.getTypes();
    }

    @Override
    public Observable<List<String>> getLanguages() {
        return this.informationGameCache.getLanguages();
    }

    @Override
    public Observable<List<String>> getQualities() {
        return this.informationGameCache.getQualities();
    }

    @Override
    public Observable<List<String>> getSets() {
        return this.informationGameCache.getSets();
    }

    @Override
    public Observable<List<String>> getFactions() {
        return this.informationGameCache.getFactions();
    }

    @Override
    public Observable<String> getPatch() {
        return this.informationGameCache.getPatch();
    }
}
