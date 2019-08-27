package com.csming.thehole.launch;

import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.csming.thehole.R;
import com.csming.thehole.main.MainActivity;

/**
 * @author Created by csming on 2019/8/27.
 */
public class LaunchActivity extends AppCompatActivity {

    private Handler handler;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        handler = new Handler(getMainLooper());
        handler.postDelayed(this::gotoNextActivity, 1000);
    }

    private void gotoNextActivity () {
        startActivity(MainActivity.getIntent(LaunchActivity.this));
    }
}
