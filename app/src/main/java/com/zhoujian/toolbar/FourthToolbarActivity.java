package com.zhoujian.toolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Created by zhoujian on 2017/3/8.
 */

public class FourthToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        initView();
    }

    private void initView()
    {

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);

        // 设置navigation button点击事件
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        //设置menu
        toolbar.inflateMenu(R.menu.menu_search);
        // 设置溢出菜单的图标
        toolbar.setOverflowIcon(getResources().getDrawable(R.mipmap.icon_menu));
        // 设置menu item 点击事件
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_search:
                        //点击设置
                        Toast.makeText(FourthToolbarActivity.this, "搜索按钮被点击了", Toast.LENGTH_SHORT).show();
                        break;

                }
                return false;
            }
        });

    }
}
