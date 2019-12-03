package com.example.history;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {
    //下面是测试数据
    private static String [] item ={"阿布都","易建联","姚明","鸡蛋灌饼"};
    ArrayList<ListItem> listItems = new ArrayList<ListItem>();
    AssetManager assetManager = null;
    private final String relePath = "../../assets/stories";
    File myFile = null;
    //strFileName存放stories文件下的所有故事的文件名称
    String[] strFileName = null;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainshow);
        int i = 0;
        //初始化playerlist
        try {
            assetManager = getAssets();
            strFileName = assetManager.list("stories");
            System.out.println(strFileName.length);
        }catch (IOException e){
            e.printStackTrace();
        }
        for (String str: strFileName) {
            listItems.add(new ListItem("test"));
        }
//        int count = 0;
//        while (!listItems.isEmpty()){
//           try {
//               System.out.println(listItems.get(count));
//               count++;
//           }catch (Exception e){
//               e.printStackTrace();
//           }
//        }

//            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.test, item);
//            ListView listView = (ListView) findViewById(R.id.ListviewTest);
//            listView.setAdapter(adapter);

        ListItemAdapter listItemAdapter = new ListItemAdapter(ListviewActivity.this,
                R.layout.item, listItems);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(listItemAdapter);
    }
}
