package mathaddict.mathmobilebangundatar;

import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class about extends AppCompatActivity {
    //Mendefinisikan MediaPlayer sebagai audioBackground
    MediaPlayer audioBackground;
    ViewPager viewPager;
    AboutSwipeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        adapter = new AboutSwipeAdapter(this);
        viewPager.setAdapter(adapter);

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



