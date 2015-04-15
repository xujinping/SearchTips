package com.xjp.searchtips;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;

import com.xjp.searchtips.wideght.OnItemClick;
import com.xjp.searchtips.wideght.SearchTipsGroupView;


public class MainActivity extends ActionBarActivity implements OnItemClick {

    private SearchTipsGroupView view;
    private String items[] = {"视频", "么么哒", "动画", "音乐", "猜你喜欢", "最近热门", "影院", "游戏", "好得多"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view = (SearchTipsGroupView) findViewById(R.id.search_tips);
        view.initViews(items, this);
    }

    @Override
    public void onClick(int position) {
        Toast.makeText(this, items[position], Toast.LENGTH_SHORT).show();
    }
}
