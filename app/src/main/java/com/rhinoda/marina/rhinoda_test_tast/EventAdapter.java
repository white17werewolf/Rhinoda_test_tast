package com.rhinoda.marina.rhinoda_test_tast;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.rhinoda.marina.rhinoda_test_tast.Presenter.EventPresenter;
import com.rhinoda.marina.rhinoda_test_tast.model.Post;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventAdapter extends RecyclerView.Adapter <EventAdapter.ViewHolder> {

    List<Post> items = new ArrayList<>();
    EventPresenter eventPresenter;

    public void update(List<Post> items){
        this.items = items;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
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
        @BindView(R.id.txtName) TextView txtName;
        @BindView(R.id.txtData) TextView txtData;
        @BindView(R.id.txtPost) TextView txtPost;
        @BindView(R.id.txtLikers) TextView txtLikers;
        @BindView(R.id.txtLikes) TextView txtLikes;
        @BindView(R.id.txtComments) TextView txtComments;
        @BindView(R.id.txtShare) TextView txtShare;
        @BindView(R.id.imgAvatar) ImageView imgAvatar;
        @BindView(R.id.imgPost) ImageView imgPost;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    
}
