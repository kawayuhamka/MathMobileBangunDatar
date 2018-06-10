package mathaddict.mathmobilebangundatar;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class geocal extends AppCompatActivity {
    //Mendefinisikan MediaPlayer sebagai audioBackground
    MediaPlayer audioBackground;

    public ImageButton persegi;
    public void init1(){
        persegi=(ImageButton)findViewById(R.id.persegi);
        final MediaPlayer audio = MediaPlayer.create(this,R.raw.buttons);

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy1= new Intent(geocal.this,htkpersegi.class);
                startActivity(toy1);
                audio.start();

            }
        });
    }


    public ImageButton persegipanjang;
    public void init2(){
        persegipanjang= (ImageButton)findViewById(R.id.persegipanjang);
        final MediaPlayer audio = MediaPlayer.create(this,R.raw.buttons);
        persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy2= new Intent(geocal.this,htkpersegipanjang.class);
                startActivity(toy2);
                audio.start();

            }
        });
    }

    public ImageButton jajargenjang;
    public void init3(){
        jajargenjang= (ImageButton)findViewById(R.id.jajargenjang);
        final MediaPlayer audio = MediaPlayer.create(this,R.raw.buttons);
        jajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy3= new Intent(geocal.this,htkjajargenjang.class);
                startActivity(toy3);
                audio.start();

            }
        });
    }

    public ImageButton Trapesium;
    public void init4(){
        Trapesium= (ImageButton)findViewById(R.id.trapesium);
        final MediaPlayer audio = MediaPlayer.create(this,R.raw.buttons);
        Trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy4= new Intent(geocal.this,htktrapesium.class);
                startActivity(toy4);
                audio.start();

            }
        });
    }

    public ImageButton layanglayang;
    public void init5(){
        layanglayang= (ImageButton)findViewById(R.id.layanglayang);
        final MediaPlayer audio = MediaPlayer.create(this,R.raw.buttons);
        layanglayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy5= new Intent(geocal.this,htklayanglayang.class);
                startActivity(toy5);
                audio.start();

            }
        });
    }

    public ImageButton lingkaran;
    public void init6(){
        lingkaran= (ImageButton)findViewById(R.id.lingkaran);
        final MediaPlayer audio = MediaPlayer.create(this,R.raw.buttons);
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy6= new Intent(geocal.this,htklingkaran.class);
                startActivity(toy6);
                audio.start();

            }
        });
    }

    public ImageButton segitiga;

    public void init7(){
        segitiga= (ImageButton)findViewById(R.id.segitiga);
        final MediaPlayer audio = MediaPlayer.create(this,R.raw.buttons);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy7= new Intent(geocal.this,htksegitiga.class);
                startActivity(toy7);
                audio.start();

            }
        });
    }

    public ImageButton belahketupat;
    public void init8(){
        belahketupat= (ImageButton)findViewById(R.id.belahketupat);
        final MediaPlayer audio = MediaPlayer.create(this,R.raw.buttons);
        belahketupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy8= new Intent(geocal.this,htkbelahketupat.class);
                startActivity(toy8);
                audio.start();

            }
        });
    }

    public Button keliling;
    public void init9(){
        keliling=(Button)findViewById(R.id.keliling);
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy9= new Intent(geocal.this,geocalkeliling.class);
                startActivity(toy9);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geocal);
        init1();
        init2();
        init3();
        init4();
        init5();
        init6();
        init7();
        init8();
        init9();
    }
}

