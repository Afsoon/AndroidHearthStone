package com.said.ahs.Fragment.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.said.ahs.R;
import com.said.ahs.model.SearchCards;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Said on 22/8/15.
 */
public class SearchResultAdapter extends RecyclerView.Adapter<SearchResultAdapter.SearchResultViewHolder> {

    public class SearchResultViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @Bind(R.id.cards_imageView)
        ImageView imageView;
        @Bind(R.id.cards_name)
        TextView textView;

        private SearchResultAdapter searchResultAdapter;

        public SearchResultViewHolder(View itemView, SearchResultAdapter searchResultAdapter) {
            super(itemView);
            this.searchResultAdapter = searchResultAdapter;
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void onClick(View v) {
            searchResultAdapter.onItemHolderClick(this);
        }
    }

    private SearchCards searchCards;
    private AdapterView.OnItemClickListener mOnItemClickListener;
    private Context context;

    public SearchResultAdapter(Context context, SearchCards cardsList) {
        this.searchCards = cardsList;
        this.context = context;
    }

    @Override
    public SearchResultViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_cards, parent, false);
        SearchResultViewHolder searchResultViewHolder = new SearchResultViewHolder(v, this);
        return searchResultViewHolder;
    }

    @Override
    public void onBindViewHolder(SearchResultViewHolder holder, int position) {
        String url = searchCards.getCardsJSONList().get(position).getImg();
        if(url != null && !url.isEmpty()){
            Picasso.with(this.context).load(url).placeholder(R.drawable.ic_placeholder_limpia).into(holder.imageView);
            holder.textView.setText(searchCards.getCardsJSONList().get(position).getName());
        }
    }

    @Override
    public int getItemCount() {
        return searchCards.getCardsJSONList().size();
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    private void onItemHolderClick(SearchResultViewHolder itemHolder) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(null, itemHolder.itemView,
                    itemHolder.getAdapterPosition(), itemHolder.getItemId());
        }
    }
}
