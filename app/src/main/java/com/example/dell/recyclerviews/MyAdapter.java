package com.example.dell.recyclerviews;

import android.content.ContentValues;
import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Dell on 6/7/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    List<Datas> data ;
    View row;

    public MyAdapter(Context context, List<Datas> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        row = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        Link link = new Link(row);
        return link;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final Datas datas = data.get(position);
        ((Link) holder).t1.setText(datas.textid);
        ((Link)holder).imageView.setImageResource(datas.imageid);
        ((Link)holder).b1.setText("<  >");
        ((Link)holder).b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"\t \t\t U Click :"+datas.textid,Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class Link extends RecyclerView.ViewHolder {
        ImageView imageView;
        Button b1;
        TextView t1;

        public Link(View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.t1);
            imageView = (ImageView) itemView.findViewById(R.id.image1);
            b1 = (Button) itemView.findViewById(R.id.b1);
        }
    }
}
