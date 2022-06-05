package com.geektech.hmwk13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText gmail;
    private EditText massege;
    private EditText text;
    private Button btnsert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gmail = findViewById(R.id.et_gmail);
        massege = findViewById(R.id.et_theme);
        text = findViewById(R.id.et_send);
        btnsert = findViewById(R.id.btnSent);
        btnsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL , gmail.getText().toString());
                intent.putExtra(Intent.EXTRA_SUBJECT , massege.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT , text.getText().toString());
                startActivity(intent);
            }
        });
    }
}