package com.example.history;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 *  四个板块,有四个页面的java类文件,四个对应的xml文件,这四个xml文件是一样的,里面的控件id也是一样的
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.his_story).setOnClickListener(this);
        findViewById(R.id.his_idiom).setOnClickListener(this);
        findViewById(R.id.his_people).setOnClickListener(this);
        findViewById(R.id.his_phi).setOnClickListener(this);
    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.his_story : {
                Intent intent = new Intent(this, Story_pageActivity.class);
//                this.onPause();
                startActivity(intent);
                break;//随便搞一个注释
            }//随便在搞一个
            case R.id.his_people : {
                Intent intent = new Intent(this, People_pageActivity.class);
//                this.onPause();
                startActivity(intent);
                break;
            }
            case R.id.his_phi : {
                Intent intent = new Intent(this, Philosophy_pageActivity.class);
//                this.onPause();
                startActivity(intent);
                break;
            }
            case R.id.his_idiom : {
                Intent intent = new Intent(this, Idiom_pageActivity.class);
//                this.onPause();
                startActivity(intent);
                break;
            }
        }
    };
}
