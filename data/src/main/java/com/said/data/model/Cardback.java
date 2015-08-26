package com.said.data.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Said on 13/8/15.
 */
public class Cardback {

    private List<CardbackJSON> cardbackJSONList = new ArrayList<CardbackJSON>();

    @JsonCreator
    public Cardback(List<CardbackJSON> cardbackJSONList) {
        this.cardbackJSONList = cardbackJSONList;
    }


    public List<CardbackJSON> getCardbackJSONList() {
        return cardbackJSONList;
    }

    public void setCardbackJSONList(List<CardbackJSON> cardbackJSONList) {
        this.cardbackJSONList = cardbackJSONList;
    }
}
