package com.sodbvi.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by glory on 2016/10/26.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
