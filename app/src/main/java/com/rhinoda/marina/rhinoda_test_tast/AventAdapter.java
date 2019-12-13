package com.rhinoda.marina.rhinoda_test_tast;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AventAdapter extends RecyclerView.Adapter <AventAdapter.ViewHolder> {

    List<RecycleItem> items;
    RecycleItem tmp;


    public void addAll(List<RecycleItem> items){
        this.items = items;
        notifyDataSetChanged();
    }

    public void setItems(List<RecycleItem> items){
        this.items = items;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.init(items.get(position));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
            TextView txtName;
            TextView txtData;
            TextView txtPost;
            TextView txtLikers;
            TextView txtLikes;
            TextView txtComments;
            TextView txtShare;
            ImageView imgAvatar;
            ImageView imgPost;

    public ViewHolder(View view) {
        super(view);

        txtName = view.findViewById(R.id.txtName);
        txtData = view.findViewById(R.id.txtData);
        txtPost = view.findViewById(R.id.txtPost);
        txtLikers = view.findViewById(R.id.txtLikers);
        txtLikes = view.findViewById(R.id.txtLikes);
        txtComments = view.findViewById(R.id.txtComments);
        imgAvatar = view.findViewById(R.id.imgAvatar);
        imgPost= view.findViewById(R.id.imgPost);
        txtShare = view.findViewById(R.id.txtShare);
        }

        public void init(RecycleItem recycleItem) {
            txtName.setText(recycleItem.getTxtName());
            txtData.setText(recycleItem.getTxtData());
            txtPost.setText(recycleItem.getTxtPost());
            txtLikers.setText(recycleItem.getTxtLikers());
            txtLikes.setText(recycleItem.getTxtLikes());
            txtComments.setText(recycleItem.getTxtComments());
            txtShare.setText(recycleItem.getTxtShare());

            //imgAvatar.

            imgPost.setImageDrawable(recycleItem.getURLimgAvatar());
            imgPost.setImageDrawable(recycleItem.getURLimgPost());
        }
    }
}
