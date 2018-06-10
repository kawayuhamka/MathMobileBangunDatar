package mathaddict.mathmobilebangundatar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Materi extends AppCompatActivity {
    //Mendefinisikan MediaPlayer sebagai audioBackground
    MediaPlayer audioBackground;

    public ImageButton pendahuluan;

    public void init1(){
        pendahuluan= (ImageButton)findViewById(R.id.pendahuluan);
        final MediaPlayer audio = MediaPlayer.create(this,R.raw.buttons);
        pendahuluan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1= new Intent(Materi.this,pendahuluan.class);
                startActivity(toy1);
                audio.start();

            }
        });
    }
    public ImageButton segiempat;

    public void init2(){
        segiempat= (ImageButton)findViewById(R.id.segiempat);
        final MediaPlayer audio = MediaPlayer.create(this,R.raw.buttons);
        segiempat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy2= new Intent(Materi.this,segiempat.class);
                startActivity(toy2);
                audio.start();

            }
        });
    }
    public ImageButton segitiga;

    public void init3(){
        segitiga= (ImageButton)findViewById(R.id.segitiga);
        final MediaPlayer audio = MediaPlayer.create(this,R.raw.buttons);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy3= new Intent(Materi.this,segitiga.class);
                startActivity(toy3);
                audio.start();


            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        init1();
        init2();
        init3();

        //Memanggil file my_sound pada folder raw
        audioBackground = MediaPlayer.create(this, R.raw.bensoundclearday);
        //Set looping ke true untuk mengulang audio jika telah selesai
        audioBackground.setLooping(true);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(100,30);
        //Memulai audio
        audioBackground.start();


    }


    @Override
    protected void onPause() {
        super.onPause();
        if (this.isFinishing()){
            audioBackground.pause();
        }
        super.onBackPressed();
        if (this.isFinishing()){
            audioBackground.pause();
        }
    }
}