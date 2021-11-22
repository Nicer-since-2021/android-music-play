package com.example.musicplayer;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MusicPlayer extends AppCompatActivity {
    private Button reSelectBtn;
    private ImageButton pnpBtn;
    private MediaPlayer mp;
    private int genre;
    Intent rec_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        rec_intent = getIntent();
        genre = rec_intent.getIntExtra("BGMgenre", 0);
        audioPlaying(genre);

        reSelectBtn = findViewById(R.id.idReSelectGenreBtn);
        reSelectBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mp.stop();
                mp.release();
                mp = null;
                finish();
            }
        });

        pnpBtn = findViewById(R.id.idPnPBtn);
        pnpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()) {
                    mp.pause();
                    pnpBtn.setImageResource(R.drawable.play_button);
                } else {
                    mp.setLooping(true);
                    mp.start();
                    pnpBtn.setImageResource(R.drawable.pause_button);
                }
            }
        });
    }

    public void audioPlaying(int gNum) {
        switch(gNum){
            case 0:
                mp = MediaPlayer.create(this, R.raw.excited);
                break;
            case 1:
                mp = MediaPlayer.create(this, R.raw.funky);
                break;
            case 2:
                mp = MediaPlayer.create(this, R.raw.relax);
                break;
            case 3:
                mp = MediaPlayer.create(this, R.raw.sensual);
                break;
        }
    }
}