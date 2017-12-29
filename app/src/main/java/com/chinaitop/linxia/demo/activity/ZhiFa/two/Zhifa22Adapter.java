package com.chinaitop.linxia.demo.activity.ZhiFa.two;

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

public class Zhifa22Adapter extends BaseAdapter {
    public Context context;
    public Zhifa22[] data;

    public Zhifa22Adapter(Context context, Zhifa22[] data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Zhifa22 getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (position == 0) {
            convertView = LayoutInflater.from(context).inflate(R.layout.title_zhifa22, parent, false);
        } else {
            ViewHolder holder;
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.item_zhifa22, parent, false);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
                if (holder == null) {
                    convertView = LayoutInflater.from(context).inflate(R.layout.item_zhifa22, parent, false);
                    holder = new ViewHolder(convertView);
                    convertView.setTag(holder);
                }
            }
            Zhifa22 item = getItem(position);
            holder.tv1.setText(item.city);
            holder.tv2.setText(item.done);
            holder.tv3.setText(item.todo);
            holder.tv4.setText(item.percent);
        }
        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.tv_1)
        TextView tv1;
        @BindView(R.id.tv_2)
        TextView tv2;
        @BindView(R.id.tv3)
        TextView tv3;
        @BindView(R.id.tv4)
        TextView tv4;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
