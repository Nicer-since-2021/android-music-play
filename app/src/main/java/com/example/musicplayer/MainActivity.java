package com.example.musicplayer;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button excitedBtn;
    private Button funkyBtn;
    private Button relaxBtn;
    private Button sensualBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        excitedBtn = findViewById(R.id.excited);
        funkyBtn = findViewById(R.id.funky);
        relaxBtn = findViewById(R.id.relax);
        sensualBtn = findViewById(R.id.sensual);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = 0;
                switch (v.getId()) {
                    case R.id.excited:
                        temp = 0;
                        break;
                    case R.id.funky:
                        temp = 1;
                        break;
                    case R.id.relax:
                        temp = 2;
                        break;
                    case R.id.sensual:
                        temp = 3;
                        break;
                }
                Intent intent = new Intent(MainActivity.this, MusicPlayer.class);
                intent.putExtra("BGMgenre", temp);
                startActivity(intent);
            }
        };

        excitedBtn.setOnClickListener(onClickListener);
        funkyBtn.setOnClickListener(onClickListener);
        relaxBtn.setOnClickListener(onClickListener);
        sensualBtn.setOnClickListener(onClickListener);
    }
}