package com.chinaitop.linxia.demo.activity.yidongjieru;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.chinaitop.linxia.demo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by yaoju on 2017/12/28.
 */

public class JieruAdapter extends BaseAdapter {
    JieRu[] data;
    Context context;

    public JieruAdapter(JieRu[] data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public JieRu getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        ViewHolder holder;
        if (v == null) {
            if (position == 0) {
                v = LayoutInflater.from(context).inflate(R.layout.work_title_layout, parent, false);
                holder = new ViewHolder(v);
            } else {
                v = LayoutInflater.from(context).inflate(R.layout.work_item_layout, parent, false);
                holder = new ViewHolder(v);
                v.setTag(holder);
            }
        } else {
            holder = (ViewHolder) v.getTag();
            if (holder==null){
                v = LayoutInflater.from(context).inflate(R.layout.work_item_layout, parent, false);
                holder = new ViewHolder(v);
                v.setTag(holder);
            }
        }
        JieRu item = getItem(position);
        holder.tv1.setText(item.field1);
        holder.tv2.setText(item.field2);
        holder.tv3.setText(item.field3);
        holder.tv4.setText(item.field4);
        holder.tv5.setText(item.field5);
        if (item.field6 != null) {
            holder.tv6.setText(item.field6);
            holder.tv6.setVisibility(View.VISIBLE);
        } else {
            holder.tv6.setVisibility(View.GONE);
        }
        if (item.field6 != null) {
            holder.tv7.setText(item.field7);
            holder.tv7.setVisibility(View.VISIBLE);
        } else {
            holder.tv7.setVisibility(View.GONE);
        }

        return v;
    }

    static class ViewHolder {
        @BindView(R.id.tv_1)
        TextView tv1;
        @BindView(R.id.tv_2)
        TextView tv2;
        @BindView(R.id.tv_3)
        TextView tv3;
        @BindView(R.id.tv_4)
        TextView tv4;
        @BindView(R.id.tv_5)
        TextView tv5;
        @BindView(R.id.tv_6)
        TextView tv6;
        @BindView(R.id.tv_7)
        TextView tv7;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
