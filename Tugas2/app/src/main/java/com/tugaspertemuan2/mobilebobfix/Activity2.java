package com.tugaspertemuan2.mobilebobfix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity2 extends AppCompatActivity {
//    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        ImageButton button = (ImageButton) findViewById(R.id.imageButtontiga);
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButtonAc2folder);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int1=new Intent(Activity2.this,MainActivity.class);
                startActivity(int1);
            }
        });
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int2=new Intent(Activity2.this,MainActivity.class);
                startActivity(int2);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Activity2.this,Activity3.class);
                startActivity(intent);
            }
        });
    }
//    public void openMainActivity() {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
//    }


}