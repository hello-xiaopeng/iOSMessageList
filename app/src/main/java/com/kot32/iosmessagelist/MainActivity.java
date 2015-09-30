package com.kot32.iosmessagelist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kot32.iosmessagelist.adapter.MessageAdapter;
import com.kot32.library.iosmeaasgelist.iOSMessageList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    iOSMessageList ioSMessageList;
    MessageAdapter messageAdapter;

    List messages = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        messageAdapter = new MessageAdapter(this, messages);

        ioSMessageList = (iOSMessageList) findViewById(R.id.list);

        ioSMessageList.setAdapter(messageAdapter);
    }

    private void initData() {
        for (int i = 0; i < 30; i++) {
            messages.add("阿里上哪里卡萨诺代码使代码了；洒满了；代码里；啊思密达了麻烦了开始的；拉什么的；拉伸的拉什么的；马上；的马上； ");
        }
    }

}
