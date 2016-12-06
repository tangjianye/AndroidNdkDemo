package com.gwi.ndk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtJni = (TextView) findViewById(R.id.txt_jni);
        txtJni.setText(JniUtils.getStringFormC());
    }
}
