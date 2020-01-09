package com.rhinoda.marina.rhinoda_test_tast;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.rhinoda.marina.rhinoda_test_tast.model.Post;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventAdapter extends RecyclerView.Adapter <EventAdapter.ViewHolder> {

    IActionView callback;

    List<Post> items = new ArrayList<>();
    private ViewHolder holder;

    public void setOnClickCallback(IActionView callback){
        this.callback = callback;
    }

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
        holder.txtDate.setText(recycleItem.getTxtDate());
        holder.txtPost.setText(recycleItem.getTxtPost());
        holder.txtLikers.setText(recycleItem.getTxtLikers());
        holder.txtLikes.setText(recycleItem.getTxtLikes());
        holder.txtComments.setText(recycleItem.getTxtComments());
        holder.txtShare.setText(recycleItem.getTxtShare());
        holder.imgAvatar.setImageResource(recycleItem.getImgAvatar());
        holder.imgPost.setImageResource(recycleItem.getImgPost());


        holder.txtLikes.setOnClickListener(v->{
            if (recycleItem.isLike){
                int like = Integer.parseInt(recycleItem.getTxtLikes())-1;
                recycleItem.setTxtLikes(like);
                recycleItem.isLike = false;
                holder.txtLikes.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_noliked,0,0,0);
            }

            else {
                int like = Integer.parseInt(recycleItem.getTxtLikes())+1;
                recycleItem.setTxtLikes(like);
                recycleItem.isLike = true;
                holder.txtLikes.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_liked,0,0,0);
            }

            callback.like(Integer.parseInt(recycleItem.getTxtLikes()));
            holder.txtLikes.setText(recycleItem.getTxtLikes());


        });

        holder.txtComments.setOnClickListener(v->{
            if (recycleItem.isComment){
                int comments = Integer.parseInt(recycleItem.getTxtComments())-1;
                recycleItem.setTxtComments(comments);
                recycleItem.isComment = false;
            }

            else {
                int comments = Integer.parseInt(recycleItem.getTxtComments())+1;
                recycleItem.setTxtComments(comments);
                recycleItem.isComment = true;
            }

            callback.comment(Integer.parseInt(recycleItem.getTxtComments()));
            holder.txtComments.setText(recycleItem.getTxtComments());
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setHolder(ViewHolder holder) {
        this.holder = holder;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.txtName) TextView txtName;
        @BindView(R.id.txtDate) TextView txtDate;
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
