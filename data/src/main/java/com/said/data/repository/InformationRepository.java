package com.said.data.repository;

import java.util.List;

import rx.Observable;

/**
 * Created by Said on 17/8/15.
 */
public interface InformationRepository {

    Observable<List<String>> getClasses();

    Observable<List<String>> getRaces();

    Observable<List<String>> getTypes();

    Observable<List<String>> getLanguages();

    Observable<List<String>> getQualities();

    Observable<List<String>> getSets();

    Observable<List<String>> getFactions();

    Observable<String> getPatch();
}
