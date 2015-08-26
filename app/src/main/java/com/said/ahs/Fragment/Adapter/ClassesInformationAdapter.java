package com.said.ahs.Fragment.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.said.ahs.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Said on 17/8/15.
 */
public class ClassesInformationAdapter extends RecyclerView.Adapter<ClassesInformationAdapter.ClassInformationViewHolder> {

    public class ClassInformationViewHolder extends RecyclerView.ViewHolder{
        @Bind(R.id.info_text)
        TextView textView;

        public ClassInformationViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private AdapterView.OnItemClickListener mOnItemClickListener;

    @Override
    public ClassInformationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ClassInformationViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }
}
