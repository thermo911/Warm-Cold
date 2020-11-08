package com.sd.warmcold;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView cityNameText = (TextView)findViewById(R.id.cityName);
        String name = MyApp.getInstance().getCurCityName().getCity();
        cityNameText.setText(name);

        int temp = MyApp.getInstance().getTemperatureStorage().getTemp();
        TextView tempText = (TextView)findViewById(R.id.curTemp);
        tempText.setText(String.format(getString(R.string.temp_value_c), temp));

        StringBuilder sb = new StringBuilder(getString(R.string.curInfo));
        sb.append(getString(R.string.cloudy)).append(", ").append(getString(R.string.raining));
        TextView textView = (TextView)findViewById(R.id.currentInfo);
        textView.setText(sb.toString());
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        int temp = MyApp.getInstance().getTemperatureStorage().getTemp();
        TextView tempText = (TextView)findViewById(R.id.curTemp);
        tempText.setText(String.format(getString(R.string.temp_value_c), temp));

        TextView cityNameText = (TextView)findViewById(R.id.cityName);
        String name = MyApp.getInstance().getCurCityName().getCity();
        cityNameText.setText(name);

        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    public void btnChangeCity(View view) {
        Intent intent = new Intent(MainActivity.this, ChooseCityActivity.class);
        startActivity(intent);
    }

    public void clickOnSettingsBtn(View view) {
        int temp = MyApp.getInstance().getTemperatureStorage().getTemp();
        MyApp.getInstance().getTemperatureStorage().setTemp(temp+1);
        temp = MyApp.getInstance().getTemperatureStorage().getTemp();

        TextView tempText = (TextView)findViewById(R.id.curTemp);
        tempText.setText(String.format(getString(R.string.temp_value_c), temp));

        Toast.makeText(MainActivity.this, "Settings coming soon", Toast.LENGTH_SHORT).show();
    }
}