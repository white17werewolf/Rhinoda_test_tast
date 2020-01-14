package com.rhinoda.marina.rhinoda_test_tast;

import android.icu.util.GregorianCalendar;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rhinoda.marina.rhinoda_test_tast.model.Post;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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

        getImage(recycleItem.getImgAvatar(), holder.imgAvatar);
        getImage(recycleItem.getImgPost(), holder.imgPost);

       // System.out.println("\nAVATAR  \n"+recycleItem.getImgAvatar()+"\nPOST        \n"+recycleItem.getImgPost());

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

    /*******************************************************************
     **********************         IMAGES           ********************
     ********************************************************************/

    public void getImage(String imgAddress, ImageView image){

        //Picasso.get().load(imgAddress).into(image);

        Glide
                .with(image)
                .load(imgAddress)
                .placeholder(R.drawable.bg_post_event)
                .error(R.drawable.mcw)
                .into(image);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String convertDate(String date){

        Long tmp = Long.parseLong(date);
        Calendar calendar = Calendar.getInstance();
        Date date2 = new Date(tmp*1000);
        calendar.setTime(date2);
        GregorianCalendar today = new GregorianCalendar();
        Month month = Month.of(calendar.get(Calendar.MONTH)+1);
        String monthRus = month.getDisplayName(TextStyle.FULL_STANDALONE, Locale.forLanguageTag("ru"));

        boolean thisDate =  calendar.get(Calendar.YEAR)==today.get(Calendar.YEAR) && calendar.get(Calendar.MONTH)==today.get(Calendar.MONTH)+1;
        String hour = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
        String minute = String.valueOf(calendar.get(Calendar.MINUTE));

        if(calendar.get(Calendar.MINUTE)<10){
            minute = "0" + calendar.get(Calendar.MINUTE);
        }

        if(calendar.get(Calendar.HOUR_OF_DAY)<10){
            hour = "0" + calendar.get(Calendar.HOUR_OF_DAY);
        }

        if(calendar.get(Calendar.DAY_OF_MONTH)==today.get(Calendar.DAY_OF_MONTH) && thisDate){
            return "Сегодня в " + hour+ ":"+ minute;
        }
        else  if(calendar.get(Calendar.DAY_OF_MONTH)==today.get(Calendar.DAY_OF_MONTH)-1 && thisDate){ return "Вчера в " + hour+":"+minute;}
        else return calendar.get(Calendar.DAY_OF_MONTH) + " " + monthRus + " в " + hour+":"+minute;
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
