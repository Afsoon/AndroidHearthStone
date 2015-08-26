package com.said.data.api;

import com.said.data.model.Info;
import com.said.data.model.SearchCards;
import com.said.data.model.Cardback;

import java.util.Map;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;
import rx.Observable;

/**
 * Created by Said on 11/8/15.
 */
public interface HearthStoneService {

    @GET("/cards")
    void getAllCards(@QueryMap Map<String, String> searchQuery);

    @GET("/cardbacks")
    Observable<Cardback> getAllCardback(@QueryMap Map<String, String> cardbackQuery);

    @GET("/cards/{type_search}/{value}")
    Observable<SearchCards> searchCards(@Path("type_search") String type_search, @Path("value") String value, @QueryMap Map<String, String> searchQuery);

    @GET("/cards/search/{value}")
    Observable<SearchCards> searchByName(@Path("value") String searchValue, @QueryMap Map<String, String> searchQuery);

    @GET("/cards/classes/{class}")
    Observable<SearchCards> searchByClass(@Path("class") String searchClassValue, @QueryMap Map<String, String> searchQuery);

    @GET("/cards/factions/{faction}")
    Observable<SearchCards> searchByFaction(@Path("faction") String searchFactionValue, @QueryMap Map<String, String> searchQuery);

    @GET("/cards/qualities/{quality}")
    Observable<SearchCards> searchByQuality(@Path("quality") String searchQualityValue, @QueryMap Map<String, String> searchQuery);

    @GET("/cards/races/{race}")
    Observable<SearchCards> searchByRace(@Path("race") String searchRaceValue, @QueryMap Map<String, String> searchQuery);

    @GET("/cards/types/{type}")
    Observable<SearchCards> searchByType(@Path("type") String searchTypeValue, @QueryMap Map<String, String> searchQuery);

    @GET("/cards/sets/{set}")
    Observable<SearchCards> searchBySet(@Path("set") String searchSetValue, @QueryMap Map<String, String> searchQuery);

    @GET("/cards/{card}")
    Observable<SearchCards> getInfoCard(@Path("card") String nameCard, @QueryMap Map<String, String> searchQuery);

    @GET("/info")
    Observable<Info> getInfo();

}
