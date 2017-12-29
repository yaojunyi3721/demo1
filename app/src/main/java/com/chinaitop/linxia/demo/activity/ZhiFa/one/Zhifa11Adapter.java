package com.chinaitop.linxia.demo.activity.ZhiFa.one;

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

public class Zhifa11Adapter extends BaseAdapter {
    public Context context;
    public ZhifaInfo[] data;

    public Zhifa11Adapter(Context context, ZhifaInfo[] data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public ZhifaInfo getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (position == 0) {
            convertView = LayoutInflater.from(context).inflate(R.layout.title_zhifa11, parent, false);
        } else {
            ViewHolder holder;
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.item_zhifa11, parent, false);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
                if (holder==null){
                    convertView = LayoutInflater.from(context).inflate(R.layout.item_zhifa11, parent, false);
                    holder = new ViewHolder(convertView);
                    convertView.setTag(holder);
                }
            }
            ZhifaInfo item = getItem(position);
            holder.tv1.setText(item.date);
            holder.tv2.setText(item.jiancharen);
            holder.tv3.setText(item.company);
            holder.tv4.setText(item.content);
            holder.tv5.setText(item.question);
            holder.tv6.setText(item.result);
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
        @BindView(R.id.tv5)
        TextView tv5;
        @BindView(R.id.tv6)
        TextView tv6;
        @BindView(R.id.line)
        View line;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
