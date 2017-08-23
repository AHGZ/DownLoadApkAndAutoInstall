package com.hgz.test.xiangmuyiyuekaod.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hgz.test.xiangmuyiyuekaod.bean.Info;

import java.util.List;

/**
 * Created by Administrator on 2017/8/23.
 */

public class MyListviewAdapter extends BaseAdapter {
    private Context context;
    private List<Info.ResultBean.DataBean> data;
    public MyListviewAdapter(Context context, List<Info.ResultBean.DataBean> data) {
        this.context=context;
        this.data=data;
    }
    public void loadMore(List<Info.ResultBean.DataBean> datas,boolean flag){
        for (Info.ResultBean.DataBean dataes :datas) {
            if (flag){
                data.add(0,dataes);
            }else{
                data.add(dataes);
            }
        }

    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView=convertView.inflate(context,android.R.layout.simple_list_item_1,null);
        }
        TextView textView = (TextView) convertView.findViewById(android.R.id.text1);
        textView.setText(data.get(position).getName());
        return convertView;
    }
}
