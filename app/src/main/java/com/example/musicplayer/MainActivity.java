package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button excitedBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        excitedBtn = findViewById(R.id.idExcited);
        excitedBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {//버튼을 눌렀을떄 second 이동 을 할꺼임
                //MainActivity 에서 SecondActivity 로 이동 경로
                Intent intent = new Intent(MainActivity.this, MusicPlayer.class);
                startActivity(intent);//액티비티 이동
            }
        });
    }
}