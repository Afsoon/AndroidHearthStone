package com.said.ahs.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.said.ahs.Fragment.Adapter.SearchResultAdapter;
import com.said.ahs.R;
import com.said.ahs.model.Cards;
import com.said.ahs.model.SearchCards;
import com.said.ahs.view.ShowSearchResultRecyclerView;
import com.said.ahs.viewmodel.ShowSearchResultViewModel;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import eu.inloop.viewmodel.base.ViewModelBaseFragment;

/**
 * Created by Said on 22/8/15.
 */
public class ShowSearchResultFragment extends ViewModelBaseFragment<ShowSearchResultRecyclerView,ShowSearchResultViewModel>
   implements ShowSearchResultRecyclerView, AdapterView.OnItemClickListener {

    private SearchCards searchCards;
    @Bind(R.id.cardsRecyclerView)
    RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private SearchResultAdapter adapter;


    public static ShowSearchResultFragment newInstance(SearchCards searchCards) {
        Bundle args = new Bundle();
        args.putParcelable("result", Parcels.wrap(searchCards));
        ShowSearchResultFragment fragment = new ShowSearchResultFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.searchCards = Parcels.unwrap(getArguments().getParcelable("result"));
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.show_cards_layout, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        instanceRecyclerView();
        setModelView(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public Class<ShowSearchResultViewModel> getViewModelClass() {
        return ShowSearchResultViewModel.class;
    }

    private void instanceRecyclerView(){
        List<Cards> cardses = new ArrayList<>();
        cardses.add(this.searchCards.getCardsJSONList().get(0));

        adapter = new SearchResultAdapter(getActivity(),this.searchCards);
        adapter.setOnItemClickListener(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
