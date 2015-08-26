package com.said.ahs.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.said.ahs.R;
import com.said.ahs.model.SearchCards;
import com.said.ahs.view.SearchInputView;
import com.said.ahs.viewmodel.SearchInputViewModel;
import com.said.data.api.queries.SearchQuery;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import eu.inloop.viewmodel.base.ViewModelBaseFragment;

/**
 * Created by Said on 20/8/15.
 */
public class SearchInputFragment extends ViewModelBaseFragment<SearchInputView, SearchInputViewModel>
    implements SearchInputView{

    @Bind(R.id.button_search)
    Button button;
    @Bind(R.id.attack_editText)
    EditText attack;
    @Bind(R.id.editText)
    EditText cost;
    @Bind(R.id.editText2)
    EditText durability;
    @Bind(R.id.editText3)
    EditText healthy;
    @Bind(R.id.spinner)
    Spinner classes;
    @Bind(R.id.spinner2)
    Spinner collectible;
    @Bind(R.id.spinner3)
    Spinner locale;

    private final String KEY_PATH_BUNDLE = "values";
    private final String KEY_VALUE_BUNDLE = "path";
    private SearchCards searchCards;
    private String path;
    private List<String> values;

    public static SearchInputFragment newInstance(@NonNull String path,@NonNull List<String> values) {

        final String KEY_PATH_BUNDLE = "values";
        final String KEY_VALUE_BUNDLE = "path";

        Bundle args = new Bundle();
        args.putString(KEY_PATH_BUNDLE, path);
        ArrayList<String> valores = new ArrayList<>(values);
        args.putStringArrayList(KEY_VALUE_BUNDLE, valores);

        SearchInputFragment fragment = new SearchInputFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        values = getArguments().getStringArrayList(KEY_VALUE_BUNDLE);
        path = getArguments().getString(KEY_PATH_BUNDLE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.search_input_fragment_layout, container, false);
        getViewModel().injectApplicationContext(getActivity().getApplicationContext());
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initializeSpinners();
        setModelView(this);
    }

    @Override
    public void showTypeSearchText(String text) {

    }

    @OnClick(R.id.button_search)
    public void doSearch(){
        getViewModel().injectSearchPathTypeValues(String.valueOf(classes.getSelectedItem()), path);
        getViewModel().doSearch(putValuesQuery());
    }

    private SearchQuery putValuesQuery(){
        return new SearchQuery(attack.getText().toString(), null, String.valueOf(collectible.getSelectedItem()), cost.getText().toString(),
                durability.getText().toString(), healthy.getText().toString(), String.valueOf(locale.getSelectedItem()));
    }

    private void initializeSpinners(){
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, this.values);
        this.classes.setAdapter(stringArrayAdapter);
    }

    @Override
    public void retrieveData(SearchCards cards) {
        this.searchCards = cards;
    }

    @Override
    public void showData() {
        getFragmentManager().beginTransaction().replace(R.id.root_content, ShowSearchResultFragment.newInstance(searchCards), "values").addToBackStack(null).commit();
    }

    @Override
    public Class<SearchInputViewModel> getViewModelClass() {
        return SearchInputViewModel.class;
    }
}
