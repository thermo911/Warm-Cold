package com.sd.warmcold;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringBuilder sb = new StringBuilder(getString(R.string.curInfo));
        sb.append(getString(R.string.cloudy)+", ");
        sb.append(getString(R.string.raining));
        TextView textView = (TextView)findViewById(R.id.currentInfo);
        textView.setText(sb.toString());

    }
}