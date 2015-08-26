package com.said.ahs.model;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Said on 20/8/15.
 */
@Parcel
public class SearchCards{

    List<Cards> cardsJSONList = new ArrayList<>();

    public SearchCards() {
    }

    public SearchCards(List<Cards> cardsJSONList) {
        this.cardsJSONList = cardsJSONList;
    }

    public List<Cards> getCardsJSONList() {
        return cardsJSONList;
    }

    public void setCardsJSONList(List<Cards> cardsJSONList) {
        this.cardsJSONList = cardsJSONList;
    }
}
