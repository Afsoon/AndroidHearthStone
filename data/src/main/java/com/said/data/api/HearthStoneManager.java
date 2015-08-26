package com.said.data.api;

import com.said.data.model.Info;
import com.said.data.model.SearchCards;
import com.said.data.model.Cardback;
import com.squareup.okhttp.OkHttpClient;

import java.util.Map;

import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.JacksonConverter;
import retrofit.http.Path;
import retrofit.http.QueryMap;
import rx.Observable;

/**
 * Created by Said on 11/8/15.
 */
public class HearthStoneManager implements HearthStoneService {

    private HearthStoneService hearthStoneService;
    private final String ENDPOINT = "https://omgvamp-hearthstone-v1.p.mashape.com";

    public HearthStoneManager() {
        hearthStoneService = new RestAdapter.Builder()
                .setClient(new OkClient(new OkHttpClient()))
                .setConverter(new JacksonConverter())
                .setErrorHandler(new RetrofitErrorHandler())
                //.setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(ENDPOINT)
                .setRequestInterceptor(new HearthStoneInterceptor())
                .build()
                .create(HearthStoneService.class);
    }

    @Override
    public void getAllCards(Map<String, String> searchQuery) {

    }

    @Override
    public Observable<Cardback> getAllCardback(Map<String, String> cardbackQuery) {
        return hearthStoneService.getAllCardback(cardbackQuery);
    }

    @Override
    public Observable<SearchCards> searchCards(@Path("type_search") String type_search, @Path("value") String value, @QueryMap Map<String, String> searchQuery) {
        return hearthStoneService.searchCards(type_search, value, searchQuery);
    }

    @Override
    public Observable<SearchCards> searchByName(String searchValue, Map<String, String> searchQuery) {
        return hearthStoneService.searchByName(searchValue, searchQuery);
    }

    @Override
    public Observable<SearchCards> searchByClass(String searchClassValue, Map<String, String> searchQuery) {
        return hearthStoneService.searchByClass(searchClassValue, searchQuery);
    }

    @Override
    public Observable<SearchCards> searchByFaction(String searchFactionValue, Map<String, String> searchQuery) {
        return hearthStoneService.searchByFaction(searchFactionValue, searchQuery);
    }

    @Override
    public Observable<SearchCards> searchByQuality(String searchQualityValue, Map<String, String> searchQuery) {
        return hearthStoneService.searchByQuality(searchQualityValue, searchQuery);
    }

    @Override
    public Observable<SearchCards> searchByRace(String searchRaceValue, Map<String, String> searchQuery) {
        return hearthStoneService.searchByRace(searchRaceValue, searchQuery);
    }

    @Override
    public Observable<SearchCards> searchByType(String searchTypeValue, Map<String, String> searchQuery) {
        return hearthStoneService.searchByType(searchTypeValue, searchQuery);
    }

    @Override
    public Observable<SearchCards> searchBySet(String searchSetValue, Map<String, String> searchQuery) {
        return hearthStoneService.searchBySet(searchSetValue, searchQuery);
    }

    @Override
    public Observable<SearchCards> getInfoCard(String nameCard, Map<String, String> searchQuery) {
        return hearthStoneService.getInfoCard(nameCard, searchQuery);
    }

    @Override
    public Observable<Info> getInfo() {
        return hearthStoneService.getInfo();
    }

}
