package com.said.data.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Said on 22/8/15.
 */
public class SearchCardsCache {
    private List<CardsJSON> cardsJSONList = new ArrayList<CardsJSON>();

    @JsonCreator
    public SearchCardsCache(@JsonProperty("list")List<CardsJSON> cardsJSONList) {
        this.cardsJSONList = cardsJSONList;
    }

    public List<CardsJSON> getCardsJSONList() {
        return cardsJSONList;
    }

    public void setCardsJSONList(List<CardsJSON> cardsJSONList) {
        this.cardsJSONList = cardsJSONList;
    }
}
