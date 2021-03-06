package com.hhk.xyz.padc_mmnews.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hhk.xyz.padc_mmnews.R;
import com.hhk.xyz.padc_mmnews.delegates.NewsItemDelegate;
import com.hhk.xyz.padc_mmnews.viewholders.NewsViewHolder;


public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {
    //private Context mContext;
    private LayoutInflater mLayoutInflator;

    private NewsItemDelegate mNewsItemDelegate;

    public NewsAdapter(Context context, NewsItemDelegate newsItemDelegate){
        //mContext = context;
        mLayoutInflator = LayoutInflater.from(context);

        mNewsItemDelegate = newsItemDelegate;

    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View newsItemView = mLayoutInflator.inflate(R.layout.view_item_news, parent, false);

        return new NewsViewHolder(newsItemView, mNewsItemDelegate);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
