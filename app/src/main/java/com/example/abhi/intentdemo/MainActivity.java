package com.example.abhi.intentdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button open;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open = (Button)findViewById(R.id.open);
    }
    public void click(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"));
        startActivity(intent);
    }
}
