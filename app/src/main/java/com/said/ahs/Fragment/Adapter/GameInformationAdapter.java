package com.said.ahs.Fragment.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.said.ahs.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Said on 16/8/15.
 */
public class GameInformationAdapter extends RecyclerView.Adapter<GameInformationAdapter.GameInformationViewHolder> {

    public class GameInformationViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @Bind(R.id.info_text)
        TextView name;
        //View view;

        private GameInformationAdapter gameInformationAdapter;

        public GameInformationViewHolder(View itemView, GameInformationAdapter gameInformationAdapter) {
            super(itemView);
            //view = itemView;
            itemView.setOnClickListener(this);
            this.gameInformationAdapter = gameInformationAdapter;
            /**view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    adapterComunication.callback(name.getText().toString());
                }
            });**/
            ButterKnife.bind(this, itemView);
        }


        @Override
        public void onClick(View v) {
            gameInformationAdapter.onItemHolderClick(this);
        }
    }

    private List<String> elementos;
    private AdapterView.OnItemClickListener mOnItemClickListener;
    private AdapterComunication adapterComunication;

    public GameInformationAdapter(List<String> elementos, AdapterComunication adapterComunication) {
        this.elementos = elementos;
        this.adapterComunication = adapterComunication;
    }


    @Override
    public GameInformationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_example,parent,false);

        GameInformationViewHolder gameInformationViewHolder = new GameInformationViewHolder(v,this);
        return gameInformationViewHolder;
    }

    @Override
    public void onBindViewHolder(GameInformationViewHolder gameInformationViewHolder, int position) {
        gameInformationViewHolder.name.setText(elementos.get(position));
    }

    @Override
    public int getItemCount() {
        return elementos.size();
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    private void onItemHolderClick(GameInformationViewHolder itemHolder) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(null, itemHolder.itemView,
                    itemHolder.getAdapterPosition(), itemHolder.getItemId());
        }
    }

}
