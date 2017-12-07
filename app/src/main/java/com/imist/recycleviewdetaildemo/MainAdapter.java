package com.imist.recycleviewdetaildemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user10 on 2017/12/7.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder>{
    private List<String> mList;

    public MainAdapter(List<String> mList) {
        this.mList = mList;
    }

    @Override
    public MainAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
    //初始化子项控件
    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.list_item_text);
        }
    }
}
