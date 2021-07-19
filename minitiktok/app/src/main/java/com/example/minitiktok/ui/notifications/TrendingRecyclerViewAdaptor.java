package com.example.minitiktok.ui.notifications;

import android.content.ContentValues;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.minitiktok.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class TrendingRecyclerViewAdaptor extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<NormalHolder> mDatas;
    public TrendingRecyclerViewAdaptor(Context context, List<NormalHolder> datas) {
        mContext = context;
        mDatas = datas;
    }

    @NonNull
    @NotNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.notification_item,parent,false);
        return new NormalHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
        NormalHolder normalHolder = mDatas.get(position);
        normalHolder.content.setText(normalHolder.content);
        normalHolder.notation.setText(normalHolder.notation);
        normalHolder.No.setImageResource(normalHolder.No);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class NormalHolder extends RecyclerView.ViewHolder{
        public TextView content, notation;
        public ImageView No, pic1, pic2;

        public NormalHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            content = (TextView) itemView.findViewById(R.id.content1);
            notation = (TextView) itemView.findViewById(R.id.content2);
            No = (ImageView) itemView.findViewById(R.id.No);
            pic1 = (ImageView) itemView.findViewById(R.id.pic1);
            pic2 = (ImageView) itemView.findViewById(R.id.pic2);
        }
    }
}
