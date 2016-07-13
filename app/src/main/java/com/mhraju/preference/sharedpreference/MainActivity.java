package com.mhraju.preference.sharedpreference;

import android.content.SharedPreferences;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editPassword;
    TextView textViewName;
    SharedPreference sharedPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = (EditText)findViewById(R.id.editName);
        editPassword = (EditText)findViewById(R.id.editPassword);
        textViewName = (TextView)findViewById(R.id.textView);
        sharedPreference = new SharedPreference(this);
    }

    public void Save(View view) {
        String nameToBeSaved = editTextName.getText().toString();
        String passwordToBeSaved = editPassword.getText().toString();
        sharedPreference.saveUserData(nameToBeSaved,passwordToBeSaved);
//        sharedPreference.saveUserData(passwordToBeSaved);
    }

    public void Show(View view) {
        String dataToBeShowed = sharedPreference.showUserData();
        textViewName.setText(dataToBeShowed);
    }
}
