package com.example.history;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListviewActivity extends AppCompatActivity {
    //下面是测试数据
    private static String [] item ={"阿布都","易建联","姚明","鸡蛋灌饼"};
    ArrayList<Player> players = new ArrayList<Player>();
    AssetManager assetManager = null;
    private final String relePath = "../../assets/stories";
    File myFile = null;
    //strFileName存放stories文件下的所有故事的文件名称
    String[] strFileName = null;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        int i = 0;
        //初始化playerlist
        try {
            assetManager = getAssets();
            strFileName = assetManager.list("stories");
        }catch (IOException e){
            e.printStackTrace();
        }
        for (String str: strFileName) {
            players.add(new Player(str));
        }

//            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.test, item);
//            ListView listView = (ListView) findViewById(R.id.ListviewTest);
//            listView.setAdapter(adapter);

        PlayerAdapter playerAdapter = new PlayerAdapter(ListviewActivity.this,
                R.layout.item,players );
        SearchView searchView = (SearchView) findViewById(R.id.searchview);
        ListView listView = (ListView) findViewById(R.id.ListviewTest);
        listView.setAdapter(playerAdapter);
    }
}
