package com.codepath.apps.restclienttemplate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codepath.apps.restclienttemplate.models.Tweet;

import java.util.List;

public class TweetsAdapter extends RecyclerView.Adapter<TweetsAdapter.viewHolder> {
    @NonNull
    Context context;
    List<Tweet> tweets;
    // Pass in the context and the list of tweets

    //for each a row, inflate the layout
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }
    //Bind  values based on the position of the element
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    // Define  a viewHolder
    public class viewHolder extends RecyclerView.ViewHolder{
ImageView ivProfileImage;
TextView tvBody;
TextView tvScreenName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            ivProfileImage =itemView.findViewById(R.id.ivProfileImage);
            tvBody =itemView.findViewById(R.id.tvBody);
            tvScreenName =itemView.findViewById(R.id.tvScreenName);
        }
    }
}
