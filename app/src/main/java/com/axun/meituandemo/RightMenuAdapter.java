package com.axun.meituandemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.axun.meituandemo.model.RightMenuModel;

import java.util.List;

import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

public class RightMenuAdapter  extends BaseAdapter implements StickyListHeadersAdapter {

    private Context context;
    private LayoutInflater inflater;

    private List<RightMenuModel> items;

    public void setItems(List<RightMenuModel> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    public RightMenuAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent) {
        HeadHolder headHolder;
        if (convertView == null){
            convertView = inflater.inflate(R.layout.item_menu_head,parent,false);
            headHolder = new HeadHolder();
            headHolder.mTvHead = convertView.findViewById(R.id.tv_head);
            convertView.setTag(headHolder);
        }else {
            headHolder = (HeadHolder) convertView.getTag();
        }

        headHolder.mTvHead.setText(items.get(position).getTypeName());
        return convertView;
    }

    @Override
    public long getHeaderId(int position) {
        return 0;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    class HeadHolder{
        TextView mTvHead;
    }

    class MenuHolder{

    }
}
