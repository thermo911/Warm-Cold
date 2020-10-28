package com.sd.warmcold;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StringBuilder sb = new StringBuilder(getString(R.string.curInfo));
        sb.append(getString(R.string.cloudy)).append(", ").append(getString(R.string.raining));
        TextView textView = (TextView)findViewById(R.id.currentInfo);
        textView.setText(sb.toString());
    }

    public void btnChangeCity(View view) {
        Intent intent = new Intent(MainActivity.this, ChooseCityActivity.class);
        startActivity(intent);
    }

    public void clockOnSettingsBtn(View view) {
        Toast.makeText(MainActivity.this, "Settings coming soon", Toast.LENGTH_SHORT).show();
    }
}