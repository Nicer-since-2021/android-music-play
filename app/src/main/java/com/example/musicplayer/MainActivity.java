package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button excitedBtn;
    private Button funkyBtn;
    private Button relaxBtn;
    private Button sensualBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, MusicPlayer.class);

        excitedBtn = findViewById(R.id.excited);
        funkyBtn = findViewById(R.id.funky);
        relaxBtn = findViewById(R.id.relax);
        sensualBtn = findViewById(R.id.sensual);

        View.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.excited:
                        intent.putExtra("BGMgenre", 0);
                    case R.id.funky:
                        intent.putExtra("BGMgenre", 1);
                    case R.id.relax:
                        intent.putExtra("BGMgenre", 2);
                    case R.id.sensual:
                        intent.putExtra("BGMgenre", 3);
                }
                startActivity(intent);
            }
        };
    }
}