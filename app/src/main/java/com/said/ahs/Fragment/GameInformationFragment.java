package com.said.ahs.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.said.ahs.AHSApplication;
import com.said.ahs.Fragment.Adapter.AdapterComunication;
import com.said.ahs.Fragment.Adapter.GameInformationAdapter;
import com.said.ahs.R;
import com.said.ahs.view.GameInformationRecyclerView;
import com.said.ahs.viewmodel.GameInformationViewModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import eu.inloop.viewmodel.base.ViewModelBaseFragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class GameInformationFragment extends ViewModelBaseFragment<GameInformationRecyclerView, GameInformationViewModel>
        implements GameInformationRecyclerView, AdapterView.OnItemClickListener, AdapterComunication{

    @Bind(android.R.id.progress)
    View mProgressView;
    @Bind(R.id.my_recycler_view)
    RecyclerView recyclerView;

    private GameInformationAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    public GameInformationFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public Class<GameInformationViewModel> getViewModelClass() {
        return GameInformationViewModel.class;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_main, container, false);
        getViewModel().injectApplicationContext(getActivity().getApplicationContext());
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        instanceRecyclerView();
        setModelView(this);
    }

    @Override
    public void showLoading() {
        mProgressView.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        mProgressView.setVisibility(View.GONE);
    }

    @Override
    public void showInfoGame(List<String> values) {
       instanceAdapter(values);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(),
                "Clicked: " + position + ", index " + recyclerView.indexOfChild(view),
                Toast.LENGTH_SHORT).show();
        String path = null;
        switch (position){
            case 0:
                path = "classes";
                break;
            case 1:
                path = "races";
                break;
            case 2:
                path = "factions";
                break;
            case 3:
                path = "types";
                break;
            case 4:
                path = "qualities";
                break;
            case 5:
                path = "sets";
                break;
        }
        List<String> values = getViewModel().getGameInformation(position);
        replaceFragment(path,values);

    }

    @Override
    public void replaceFragment(String path, List<String> values){
        getFragmentManager().beginTransaction()
                .replace(R.id.root_content, SearchInputFragment.newInstance(path, values), "emptyFragment")
                .addToBackStack(null).commit();
    }

    @Override
    public void callback(String text) {
        Toast.makeText(getActivity(),
                "Clicked: " + text,
                Toast.LENGTH_SHORT).show();

    }

    private void instanceAdapter(List<String> values){
        adapter = new GameInformationAdapter(values, this);
        adapter.setOnItemClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    private void instanceRecyclerView(){
        recyclerView.setHasFixedSize(true);
        instanceAdapter(new ArrayList<String>());
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
    }

}
