package com.rhinoda.marina.rhinoda_test_tast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AventAdapter extends RecyclerView.Adapter <AventAdapter.ViewHolder> {

    private List<RecycleItem> listItems;
    private Context mContext;

    public AventAdapter(List<RecycleItem> listItems, Context mContext) {
        this.listItems = listItems;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.avent, parent, false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull AventAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txtTitle;
        public TextView txtDescription;
        public TextView txtOptionDigit;
        public ViewHolder(View itemView) {
            super(itemView);
           // txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
            //txtDescription = (TextView) itemView.findViewById(R.id.txtDescription);
           // txtOptionDigit = (TextView) itemView.findViewById(R.id.txtOptionDigit);
        }
    }
}
