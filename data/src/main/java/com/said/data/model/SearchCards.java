package com.said.data.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Said on 14/8/15.
 */
public class SearchCards {

    private List<CardsJSON> cardsJSONList = new ArrayList<CardsJSON>();

    @JsonCreator
    public SearchCards(List<CardsJSON> cardsJSONList) {
        this.cardsJSONList = cardsJSONList;
    }

    public List<CardsJSON> getCardsJSONList() {
        return cardsJSONList;
    }

    public void setCardsJSONList(List<CardsJSON> cardsJSONList) {
        this.cardsJSONList = cardsJSONList;
    }
}
