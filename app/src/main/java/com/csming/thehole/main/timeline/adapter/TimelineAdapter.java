package com.csming.thehole.main.timeline.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.csming.thehole.R;

/**
 * @author Created by csming on 2019-08-30.
 */
public class TimelineAdapter extends RecyclerView.Adapter<TimelineAdapter.TimelineHolder> {

    private int mSize = 0;

    public TimelineAdapter(int size) {
        this.mSize = size;
    }

    @NonNull
    @Override
    public TimelineHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_timeline, parent, false);
        return new TimelineHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TimelineHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return mSize;
    }

    static class TimelineHolder extends RecyclerView.ViewHolder {
        public TimelineHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
