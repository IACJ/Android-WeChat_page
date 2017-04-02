package com.example.experience1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Message> messageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //填加toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("我的微信");
        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                MyToast.showToast(MainActivity.this,"你点击了:"+item.getTitle()+" 选项");
                return true;
            }
        });

        //填加RecyclerView
        initMessage();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MessageAdapter adapter = new MessageAdapter(messageList);
        recyclerView.setAdapter(adapter);

        //底部事件
        findViewById(R.id.bottom).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyToast.showToast(MainActivity.this,"你点击了底部按钮");
            }
        });
    }

    public void initMessage(){
        Message message;
        for (int i=0; i<3;i++){
            message = new Message(R.drawable.zhenerzi,"真儿子","爸爸在吗？","19:12");
            messageList.add(message);
            message = new Message(R.drawable.caoerzi,"曹儿子","爸爸，去哪儿？","19:11");
            messageList.add(message);
            message = new Message(R.drawable.acj,"ACJ","[图片]","19:10");
            messageList.add(message);
            message = new Message(R.drawable.yiningdashen,"一宁大神","嗯嗯，了解","19:10");
            messageList.add(message);
            message = new Message(R.drawable.laoban,"老板","现在进度怎么样了","18:40");
            messageList.add(message);
            message = new Message(R.drawable.fanwei,"范为","哦","18:40");
            messageList.add(message);
            message = new Message(R.drawable.haha,"HAHA","你好，我是视觉设计部的新部长","17:47");
            messageList.add(message);
            message = new Message(R.drawable.lvqi,"氯气","通信原理那道题你会吗？","16:18");
            messageList.add(message);
            message = new Message(R.drawable.tianjia,"佳族CIC","你要过去的时候叫我吧","15:06");
            messageList.add(message);
            message = new Message(R.drawable.lilili,"黎狸梨","我在路上了","15:06");
            messageList.add(message);
            message = new Message(R.drawable.xingyu,"陈星宇","象拔蚌，我们走！","15:05");
            messageList.add(message);
            message = new Message(R.drawable.zhigang,"志港",
                    "菜哦中昊,这都不会写。教你啊，要这样...","1:09");
            messageList.add(message);
        }
    }
}
