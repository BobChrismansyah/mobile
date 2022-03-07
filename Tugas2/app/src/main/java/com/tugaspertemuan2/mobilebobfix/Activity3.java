package com.tugaspertemuan2.mobilebobfix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
    TextView linkTextView;
    private View button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        ImageButton button3 = (ImageButton) findViewById(R.id.imageButtonAc3home);
        ImageButton button4 = (ImageButton) findViewById(R.id.imageButtonAc3profil);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int3 = new Intent(Activity3.this,MainActivity.class);
                startActivity(int3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(Activity3.this,Activity2.class);
                startActivity(int4);
            }
        });
        //https://www.tutorialspoint.com/how-to-create-clickable-links-in-a-textview-on-android
        linkTextView = findViewById(R.id.github);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView = findViewById(R.id.instagram);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView = findViewById(R.id.email);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        linkTextView = findViewById(R.id.linklinkedin);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}