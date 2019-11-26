package com.example.history;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class People_pageActivity extends AppCompatActivity implements View.OnClickListener {
    AssetManager assetManager = null;
    private final String relePath = "../../assets/stories";
    File myFile = null;
    //strFileName存放stories文件下的所有故事的文件名称
    String[] strFileName = null;
    //txvButton存放对p1到p9的文本显示引用，便于在按了下一页按钮之后，显示的人物名字随之改变
    TextView[] txvButton = new TextView[9];
    //currentCount是计算当前到第几页，一页显示9个人物，翻页的时候，currentCount就要加9，作为下标，在fileName中获取名字
    int intCurrentCount = 0;
    //loadPage函数用于对一些动态的UI进行修改
    public void loadPage(){
        for (TextView v:txvButton) {
            v.setText(strFileName[intCurrentCount]);
            intCurrentCount++;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_page);
       try {
           assetManager = getAssets();
           strFileName = assetManager.list("stories");
       }catch (NullPointerException e){
           e.printStackTrace();
       }
       catch (IOException e){
           e.printStackTrace();
       }
        txvButton[0] = findViewById(R.id.p1);
        txvButton[1] = findViewById(R.id.p2);
        txvButton[2] = findViewById(R.id.p3);
        txvButton[3] = findViewById(R.id.p4);
        txvButton[4] = findViewById(R.id.p5);
        txvButton[5] = findViewById(R.id.p6);
        txvButton[6] = findViewById(R.id.p7);
        txvButton[7] = findViewById(R.id.p8);
        txvButton[8] = findViewById(R.id.p9);
        for (String strName : strFileName){
            strName.replace("txt"," ");
        }
        for (TextView v:txvButton) {
            v.setText(strFileName[intCurrentCount]);
            intCurrentCount++;
        }

    }
    @Override
    public boolean onKeyDown(int code, KeyEvent keyEvent){
        if (code == keyEvent.KEYCODE_BACK){
            this.finish();
        }
        return true;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.p1:{

            }
            case R.id.p2:{

            }
            case R.id.p3:{

            }
            case R.id.p4:{

            }
            case R.id.p5:{

            }
            case R.id.p6:{

            }
            case R.id.p7:{

            }
            case R.id.p8:{

            }
            case R.id.p9:{

            }
            case R.id.next_page:{
                loadPage();
                break;
            }
        }
    }
}
