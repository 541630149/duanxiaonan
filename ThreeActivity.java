package com.example.day26_classwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ThreeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }

    @Override
    public void preBtn(View view) {
        startActivity(new Intent(ThreeActivity.this,SecondActivity.class));
        finish();
        overridePendingTransition(R.anim.pre_in,R.anim.pre_out);
    }

    @Override
    public void nextBtn(View view) {
        startActivity(new Intent(ThreeActivity.this,FourActivity.class));
        finish();
        overridePendingTransition(R.anim.next_in,R.anim.next_out);
    }
}
