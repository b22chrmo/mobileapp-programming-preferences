package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    public EditText editText;
    public static String editedText = "Shared pref";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    Button buttonSecondReturn = (Button) findViewById(R.id.button2);
    Button buttonSecondSave = (Button) findViewById(R.id.button);
    editText = (EditText) findViewById(R.id.edittext);
    buttonSecondReturn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent2);
        }
    });
    buttonSecondSave.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            saveText();

        }
    });
    }
 public void saveText() {
     SharedPreferences sharedPref = getSharedPreferences(editedText, MODE_PRIVATE);
     SharedPreferences.Editor editor = sharedPref.edit();
     editor.putString(editedText, editText.getText().toString()).apply();
 }
}
