package com.rhinoda.marina.rhinoda_test_tast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AventAdapter extends RecyclerView.Adapter <AventAdapter.ViewHolder> {

    //private List<RecycleItem> listItems;
    private Context mContext;
    private List<RecycleItem> recycleItemList = new ArrayList<>();

    public void setItems(Collection<RecycleItem> tweets) {
        recycleItemList.addAll(tweets);
        notifyDataSetChanged();
    }

    public void clearItems() {
        recycleItemList.clear();
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.avent, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return recycleItemList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtData;
        TextView txtPost;
        TextView txtLikers;
        TextView txtLikes;
        TextView txtComments;
        ImageView imgAvatar;
        ImageView imgPost;
        ImageView imgLikers;
        ImageView imgLikes;
        ImageView imgComments;
        ImageView imgShare;

    public ViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtData = itemView.findViewById(R.id.txtData);
            txtPost = itemView.findViewById(R.id.txtPost);
            txtLikers = itemView.findViewById(R.id.txtLikers);
            txtLikes = itemView.findViewById(R.id.txtLikes);
            txtComments = itemView.findViewById(R.id.txtComments);
            imgAvatar = itemView.findViewById(R.id.imgAvatar);
            imgPost= itemView.findViewById(R.id.imgPost);
            imgLikers= itemView.findViewById(R.id.imgLikers);
            imgLikes = itemView.findViewById(R.id.imgLikes);
            imgComments = itemView.findViewById(R.id.imgComments);
            imgShare = itemView.findViewById(R.id.imgShare);
        }
    }

    public AventAdapter(List<RecycleItem> recycleItemList, Context mContext) {
        this.recycleItemList = recycleItemList;
        this.mContext = mContext;
    }
}
