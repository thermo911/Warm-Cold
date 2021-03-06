package com.sd.warmcold;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ChooseCityActivity extends AppCompatActivity {

    private static final String TAG = "SOME TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_city);
    }

    public void clickOnCityNameText(View view) {
        Toast.makeText(ChooseCityActivity.this, ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
        EditText editText = (EditText)findViewById(R.id.chosenCityEditText);
        editText.setText(((TextView)view).getText());
        Log.v(TAG, String.valueOf(((TextView)view).getText()));
    }

    public void btnConfirmChoose(View view) {

        EditText editText = (EditText)findViewById(R.id.chosenCityEditText);
        if(String.valueOf(editText.getText()).trim().isEmpty()) {
            Toast.makeText(ChooseCityActivity.this, "Empty string!", Toast.LENGTH_SHORT).show();
        } else {
            MyApp.getInstance().getCurCityName().setCity(String.valueOf(editText.getText()));
            Intent intent = new Intent(ChooseCityActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}