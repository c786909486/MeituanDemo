package com.axun.meituandemo;

import android.content.Context;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.axun.meituandemo.model.LeftModel;

import java.util.List;

public class LeftMenuAdapter extends BaseAdapter {

    private Context context;
    private List<LeftModel> items;

    int select=-1;

    public void setSelect(int select) {
        this.select = select;
        notifyDataSetChanged();
    }

    public LeftMenuAdapter(Context context) {
        this.context = context;
    }

    public void setItems(List<LeftModel> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return items==null?0:items.size();
    }

    @Override
    public Object getItem(int position) {
        return items==null?null:items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items==null?0:position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_menu_left,parent,false);
        TextView tvName = convertView.findViewById(R.id.tv_name);
        tvName.setText(items.get(position).getName());
        TextPaint tp = tvName.getPaint();
        if (position == select){
            tvName.setSelected(true);
            tp.setFakeBoldText(true);
        }else {
            tvName.setSelected(false);
            tp.setFakeBoldText(false);
        }
        return convertView;
    }
}
