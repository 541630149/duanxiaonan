package com.example.day26_classwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public abstract class BaseActivity extends AppCompatActivity {
    private GestureDetector gDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gDetector = new GestureDetector(this, new GestureDetector.OnGestureListener() {
            @Override
            public boolean onDown(MotionEvent e) {
                return false;
            }

            @Override
            public void onShowPress(MotionEvent e) {

            }

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return false;
            }

            @Override
            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
                return false;
            }

            @Override
            public void onLongPress(MotionEvent e) {

            }

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                if (Math.abs(velocityX) < 100) {
                    Toast.makeText(BaseActivity.this, "骚年，手速不够啊...", Toast.LENGTH_SHORT).show();
                    return true;
                }
                if (Math.abs(e1.getRawX() - e2.getRawX()) < 100) {
                    Toast.makeText(BaseActivity.this, "不好意思，有点儿短...", Toast.LENGTH_SHORT).show();
                    return true;
                }
                if (e1.getRawX() - e2.getRawX() > 100) {
                    nextBtn(null);
                }
                if (e1.getRawX() - e2.getRawX() < 100) {
                    preBtn(null);
                }
                return false;
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    public abstract void preBtn(View view);

    public abstract void nextBtn(View view);
}
