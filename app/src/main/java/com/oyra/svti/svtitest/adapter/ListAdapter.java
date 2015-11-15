package com.oyra.svti.svtitest.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.oyra.svti.svtitest.R;
import com.oyra.svti.svtitest.data.Program;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {


    private List<Program> mList;

    public ListAdapter() {
        mList = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mText.setText(mList.get(position).getName());
        Picasso.with(holder.mImg.getContext()).load(mList.get(position).getProgramimage())
                .placeholder(R.drawable.noimage)
                .error(R.drawable.noimage)
                .fit()
                .into(holder.mImg);
    }

    public Program getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    private void add(Program item) {
        mList.add(item);
        notifyItemInserted(mList.size() - 1);
    }

    public void addAll(List<Program> progs) {
        for (Program p : progs) {
            add(p);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView mText;
        ImageView mImg;

        public ViewHolder(View itemView) {
            super(itemView);
            mText = (TextView) itemView.findViewById(R.id.text);
            mImg = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}
