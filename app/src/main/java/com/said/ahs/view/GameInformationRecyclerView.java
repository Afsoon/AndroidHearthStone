package com.said.ahs.view;

import java.util.List;

import eu.inloop.viewmodel.IView;

/**
 * Created by Said on 16/8/15.
 */
public interface GameInformationRecyclerView extends IView {

    void showLoading();

    void hideLoading();

    void showInfoGame(List<String> valores);

    void replaceFragment(String path, List<String> values);
}
