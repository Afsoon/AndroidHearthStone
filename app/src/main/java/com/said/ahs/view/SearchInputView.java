package com.said.ahs.view;


import com.said.ahs.model.SearchCards;

import eu.inloop.viewmodel.IView;

/**
 * Created by Said on 20/8/15.
 */
public interface SearchInputView extends IView {

    void showTypeSearchText(String text);

    void retrieveData(SearchCards cards);

    void showData();
}
