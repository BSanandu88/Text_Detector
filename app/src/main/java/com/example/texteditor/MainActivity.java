package com.example.texteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
     private Button captureBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        captureBtn = findViewById(R.id.idBtncapture);
        captureBtn.setOnClickListener(new View.OnClickListener(){
            @Override
                    pubic void onClick(View v){
                Intent i = new Intent(MainActivity.this,ScannerActivity.class);
                startActivity(i);
            }
        });

    }
}
