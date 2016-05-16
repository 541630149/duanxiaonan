package com.example.day26_classwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void preBtn(View view) {

    }

    public void nextBtn(View view) {
        startActivity(new Intent(MainActivity.this,SecondActivity.class));
        finish();
        overridePendingTransition(R.anim.next_in,R.anim.next_out);
    }
}
