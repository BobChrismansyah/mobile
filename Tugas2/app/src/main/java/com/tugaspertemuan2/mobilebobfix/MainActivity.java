package com.tugaspertemuan2.mobilebobfix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tView;
    TextView linkTextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button = (ImageButton) findViewById(R.id.imageButton);
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,Activity3.class);
                startActivity(intent);
            }
        });
        linkTextView = findViewById(R.id.mailtomail);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}