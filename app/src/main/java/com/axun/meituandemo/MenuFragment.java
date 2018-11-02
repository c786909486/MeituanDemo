package com.axun.meituandemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.axun.meituandemo.model.LeftModel;

import java.util.ArrayList;
import java.util.List;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

public class MenuFragment extends Fragment {

    private ListView mLvLeft;
    private StickyListHeadersListView mLvRight;

    private LeftMenuAdapter leftAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_menu, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initView(View view) {
        mLvLeft = (ListView) view.findViewById(R.id.lv_left);
        mLvRight = (StickyListHeadersListView) view.findViewById(R.id.lv_right);
        leftAdapter = new LeftMenuAdapter(getContext());
        mLvLeft.setAdapter(leftAdapter);
        mLvLeft.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                leftAdapter.setSelect(position);
            }
        });

    }

    private void initData(){
        List<LeftModel> lefts = new ArrayList<>();
        lefts.add(new LeftModel("推荐1","1"));
        lefts.add(new LeftModel("推荐2","2"));
        lefts.add(new LeftModel("推荐3","3"));
        lefts.add(new LeftModel("推荐4","4"));
        lefts.add(new LeftModel("推荐5","5"));
        lefts.add(new LeftModel("推荐6","6"));
        lefts.add(new LeftModel("推荐7","7"));
        lefts.add(new LeftModel("推荐8","8"));
        lefts.add(new LeftModel("推荐9","9"));
        lefts.add(new LeftModel("推荐10","10"));
        leftAdapter.setItems(lefts);
        leftAdapter.setSelect(0);


    }
}
