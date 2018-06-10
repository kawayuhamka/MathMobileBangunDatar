package mathaddict.mathmobilebangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static mathaddict.mathmobilebangundatar.R.id.sisisejajar;


public class htktrapesium extends AppCompatActivity {
    EditText s1, s2, t;
    Button hitung;
    TextView hasil;
    Button reset;


    public Button home;
        public void init1(){
        home=(Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy1= new Intent(htktrapesium.this,MainActivity.class);
                startActivity(toy1);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htktrapesium);

        reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1.setText( String.valueOf(""));
                s2.setText( String.valueOf(""));
                t.setText( String.valueOf(""));
                hasil.setText( String.valueOf("Hasil"));
            }
        });


        init1();
        s1 = (EditText) findViewById(sisisejajar);
        s2 = (EditText) findViewById(R.id.sisisejajar2);
        t = (EditText) findViewById(R.id.tinggi);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s1.length() == 0 && s2.length() == 0 && t.length() == 0) {
                    Toast.makeText(getApplication(), "Belum ada yang diisi", Toast.LENGTH_LONG).show();
                } else if (s1.length() == 0) {
                    Toast.makeText(getApplication(), "sisi sejajar AB belum diisi", Toast.LENGTH_LONG).show();
                } else if (s2.length() == 0) {
                    Toast.makeText(getApplication(), "sisi Sejajar CD belum diisi", Toast.LENGTH_LONG).show();
                } else if (t.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Tinggi belum diisi", Toast.LENGTH_SHORT).show();
                } else {
                    String sisisejajar = s1.getText().toString();
                    String sisisejajar2 = s2.getText().toString();
                    String tinggi = t.getText().toString();
                    double s1 = Double.parseDouble(sisisejajar);
                    double s2 = Double.parseDouble(sisisejajar2);
                    double t = Double.parseDouble(tinggi);
                    double hs = Luastrapesium(s1, s2, t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                    output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });

    }

    public double Luastrapesium(double s1, double s2, double t) {
        return (s1 + s2) * t * 0.5;
    }


}
