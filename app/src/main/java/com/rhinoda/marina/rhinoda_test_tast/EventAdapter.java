package com.rhinoda.marina.rhinoda_test_tast;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.rhinoda.marina.rhinoda_test_tast.model.Post;

import java.util.List;

//todo replace EventAdapter
public class EventAdapter extends RecyclerView.Adapter <EventAdapter.ViewHolder> {

    List<Post> items;


    public void addAll(List<Post> items){
        this.items = items;
        notifyDataSetChanged();
    }

    public void setItems(List<Post> items){
        this.items = items;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       /* holder.init(items.get(position));*/
        Post recycleItem = items.get(position);

        holder.txtName.setText(recycleItem.getTxtName());
        holder.txtData.setText(recycleItem.getTxtData());
        holder.txtPost.setText(recycleItem.getTxtPost());
        holder.txtLikers.setText(recycleItem.getTxtLikers());
        holder.txtLikes.setText(recycleItem.getTxtLikes());
        holder.txtComments.setText(recycleItem.getTxtComments());
        holder.txtShare.setText(recycleItem.getTxtShare());
        holder.imgAvatar.setImageResource(recycleItem.getImgAvatar());
        holder.imgPost.setImageResource(recycleItem.getImgPost());

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

    }
}
