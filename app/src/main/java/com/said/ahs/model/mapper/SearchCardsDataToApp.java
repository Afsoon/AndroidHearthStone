package com.said.ahs.model.mapper;

import com.said.ahs.model.Cards;
import com.said.ahs.model.SearchCards;
import com.said.data.model.CardsJSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Said on 21/8/15.
 */
public class SearchCardsDataToApp {

    public SearchCardsDataToApp() {
    }

    public SearchCards transform(com.said.data.model.SearchCards searchCardsData){
        SearchCards searchCardsApp;
        List<Cards> cardsApp = transformListCards(searchCardsData.getCardsJSONList());
        searchCardsApp = new SearchCards(cardsApp);

        return  searchCardsApp;
    }

    private List<Cards> transformListCards(List<CardsJSON> cardsJSONs){
        List<Cards> cardses = new ArrayList<>();
        for(CardsJSON cardsJSON : cardsJSONs){
            Cards cards = transformCards(cardsJSON);
            cardses.add(cards);
        }
        return cardses;
    }

    private Cards transformCards(CardsJSON cardsJSON){
        return new Cards(cardsJSON);
    }
}
