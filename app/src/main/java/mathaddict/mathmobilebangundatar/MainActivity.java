package mathaddict.mathmobilebangundatar;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    //Mendefinisikan MediaPlayer sebagai audioBackground
    MediaPlayer audioBackground;

    public ImageButton materi;
    public void init1() {
        materi = (ImageButton) findViewById(R.id.materi);
        final MediaPlayer audiomateri = MediaPlayer.create(this,R.raw.buttons);
        materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy1 = new Intent(MainActivity.this, Materi.class);
                startActivity(toy1);
                audiomateri.start();


            }
        });
    }


    public ImageButton quiz;
    public void init3() {
        quiz = (ImageButton) findViewById(R.id.quiz);
        final MediaPlayer audioquis = MediaPlayer.create(this,R.raw.buttons);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy3 = new Intent(MainActivity.this, bukaquis.class);
                startActivity(toy3);
                audioquis.start();

            }
        });
    }

    public ImageButton geocal;
    public void init4() {
        geocal = (ImageButton) findViewById(R.id.geocal);
        final MediaPlayer audiogeocal = MediaPlayer.create(this,R.raw.buttons);
        geocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy4 = new Intent(MainActivity.this, geocal.class);
                startActivity(toy4);
                audiogeocal.start();


            }
        });
    }

    public ImageButton about;
    public void init5() {
        about = (ImageButton) findViewById(R.id.about);
        final MediaPlayer audioabout = MediaPlayer.create(this,R.raw.buttons);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy5 = new Intent(MainActivity.this, about.class);
                startActivity(toy5);
                audioabout.start();


            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init1();
        init3();
        init4();
        init5();

       }

    @Override
    protected void onPause() {
        super.onPause();
        if (this.isFinishing()){
            audioBackground.pause();
        }
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Apakah ingin Menutup Aplikasi?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public boolean onCreateOptionsMenu(MainActivity menu) {
        return true;
    }
}
