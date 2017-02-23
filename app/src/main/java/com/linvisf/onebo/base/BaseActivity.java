package com.linvisf.onebo.base;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by linhong on 2016/12/23.
 * <p>
 * 描述：
 */

public class BaseActivity extends AppCompatActivity {

    protected final  <T extends View> T xFindViewById(int id) {
        return (T)findViewById(id);
    }

}
