package com.said.ahs.viewmodel;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.said.ahs.view.ShowSearchResultRecyclerView;
import com.squareup.picasso.Picasso;

import eu.inloop.viewmodel.AbstractViewModel;

/**
 * Created by Said on 22/8/15.
 */
public class ShowSearchResultViewModel extends AbstractViewModel<ShowSearchResultRecyclerView> {

    @Override
    public void onCreate(@Nullable Bundle arguments,@Nullable Bundle savedInstanceState) {
        super.onCreate(arguments, savedInstanceState);
    }

    @Override
    public void bindView(@NonNull ShowSearchResultRecyclerView view) {
        super.bindView(view);
    }

    @Override
    public void saveState(Bundle bundle) {
        super.saveState(bundle);
    }

    @Override
    public void onModelRemoved() {
        super.onModelRemoved();
    }
}
