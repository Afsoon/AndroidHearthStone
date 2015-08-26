package com.said.data.cache;

import com.said.data.model.Info;

import java.util.List;

import rx.Observable;

/**
 * Created by Said on 18/8/15.
 */
public interface InformationGameCache {

    Observable<List<String>> getClasses();

    Observable<List<String>> getRaces();

    Observable<List<String>> getTypes();

    Observable<List<String>> getLanguages();

    Observable<List<String>> getQualities();

    Observable<List<String>> getSets();

    Observable<List<String>> getFactions();

    Observable<String> getPatch();

    void put(Info info);

    boolean isCached();

    boolean isCacheUpdate();

}
