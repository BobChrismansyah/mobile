package com.tugaspertemuan2.myapplicationbiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextClock tclock;
    private TextView tView;
    TextView linkTextView;
    //fungsi tombol ke activity baru
    //https://www.youtube.com/watch?v=bgIUdb-7Rqo&t=46s
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });
    }
    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);

//        textView = findViewById(R.id.textViewLink);
//        textView.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView =findViewById(R.id.activity_main_hyperlink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}