package com.example.history;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class Story_pageActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_page);
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
        }
    }
}
