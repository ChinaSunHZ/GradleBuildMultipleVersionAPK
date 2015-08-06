package com.sunhz.gradlebuildmultipleversionapk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * MainActivity 显示不同版本标识
 * Created by Spencer on 8/6/15.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView lable = new TextView(this);
        lable.setText(getResources().getString(R.string.versionFlag) + "\n titleBar 上面的文字太长了..一部分用 xxx 代替了..");

        setContentView(lable);


    }
}
