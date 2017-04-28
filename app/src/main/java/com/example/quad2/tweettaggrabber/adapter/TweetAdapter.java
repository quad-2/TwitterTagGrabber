package com.example.quad2.tweettaggrabber.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quad2.tweettaggrabber.R;
import com.example.quad2.tweettaggrabber.pojo.twitterSearchResponse.Status;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by praveen on 27/4/17.
 */

public class TweetAdapter extends RecyclerView.Adapter<TweetAdapter.ViewHolder> {

    private Context context;
    private List<Status> statuses = new ArrayList<>();

    public TweetAdapter(Context context, List<Status> statuses) {
        this.context = context;
        this.statuses = statuses;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_tweet, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Status status = getItem(position);
        if (status!=null){
            if (status.getText()!=null && status.getText().length()>0){
                holder.tweetText.setText(status.getText());
            }

            if (status.getUser()!=null){
                if (status.getUser().getProfileBackgroundImageUrlHttps()!=null && status.getUser()
                        .getProfileBackgroundImageUrlHttps().length()>0){
                    Picasso.with(context)
                            .load(status.getUser().getProfileBackgroundImageUrlHttps())
                            .resize(80, 80)
                            .centerCrop()
                            .into(holder.imageView);
                }
            }
        }
    }

    @Override
    public int getItemCount() {
        return statuses.size();
    }

    public Status getItem(int position) {
        return position < statuses.size() ? statuses.get(position) : null;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView ;
        TextView tweetText;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.profile_image);
            tweetText = (TextView) itemView.findViewById(R.id.tweet_text);
        }
    }
}
