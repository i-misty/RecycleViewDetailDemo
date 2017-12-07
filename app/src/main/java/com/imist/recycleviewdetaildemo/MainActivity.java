package com.imist.recycleviewdetaildemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<String> mList ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
        initAdapter();
    }


    private void initView() {
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.main_recycleview);
    }
    private void initAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        //默认垂直;
        //linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,4);
        //默认垂直
        //gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        //水平
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.HORIZONTAL);
        //垂直
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(staggeredGridLayoutManager2);
        recyclerView.addItemDecoration(new MyDividerItemDecoration(this, MyDividerItemDecoration.VERTICAL_LIST));
        //初始化和设置Adapter
        MainAdapter mainAdapter = new MainAdapter(mList);
        recyclerView.setAdapter(mainAdapter);

    }

    private void initData() {
        mList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mList.add("纵向和横向滑动");
            mList.add("纵向和横向瀑布流");
            mList.add("添加头布局和脚布局");
            mList.add("下拉刷新和上拉加载");
            mList.add("多布局页面");
            mList.add("滑动删除");
            mList.add("点击事件");
            mList.add("添加空布局");
            mList.add("添加分割线");
        }
    }
}
