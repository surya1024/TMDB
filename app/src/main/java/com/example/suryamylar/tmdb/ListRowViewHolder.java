package com.example.suryamylar.tmdb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.example.suryamylar.tmdb.R;

/**
 * Created by suryamylar on 7/14/15.
 */
public class ListRowViewHolder extends RecyclerView.ViewHolder {

    protected NetworkImageView thumbnail;
    protected TextView title;
    protected TextView date;
    protected RatingBar ratingBar;
    protected TextView url;
    protected RelativeLayout relativeLayout;

    public ListRowViewHolder(View view) {
        super(view);
        this.thumbnail = (NetworkImageView) view.findViewById(R.id.network_image);
        this.title = (TextView) view.findViewById(R.id.title);
        this.date = (TextView) view.findViewById(R.id.date);
        this.ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);
        this.url = (TextView) view.findViewById(R.id.url);
        this.relativeLayout = (RelativeLayout) view.findViewById(R.id.relLayout);
        view.setClickable(true);
    }

}