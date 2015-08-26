package com.said.data.repository.datasource;

import java.util.List;

import rx.Observable;

/**
 * Created by Said on 18/8/15.
 */
public interface InformationDataStore {

    Observable<List<String>> getClasses();

    Observable<List<String>> getRaces();

    Observable<List<String>> getTypes();

    Observable<List<String>> getLanguages();

    Observable<List<String>> getQualities();

    Observable<List<String>> getSets();

    Observable<List<String>> getFactions();

    Observable<String> getPatch();
}
