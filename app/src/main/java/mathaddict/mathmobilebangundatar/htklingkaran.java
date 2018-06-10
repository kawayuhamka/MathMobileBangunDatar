package mathaddict.mathmobilebangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class htklingkaran extends AppCompatActivity {
    EditText r;
    Button hitung;
    TextView hasil;
    Button reset;
    public Button home;

    public void init1(){
        home=(Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy1= new Intent(htklingkaran.this,MainActivity.class);
                startActivity(toy1);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htklingkaran);
        reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setText( String.valueOf(""));
                hasil.setText( String.valueOf("Hasil"));
            }
        });

        init1();
        r = (EditText) findViewById(R.id.jarijari);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (r.length() == 0) {
                    Toast.makeText(getApplication(), "jari-jari tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (r.length() == 0) {
                    Toast.makeText(getApplication(), "jari-jari tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    String jarijari = r.getText().toString();
                    double r= Double.parseDouble(jarijari);
                    double phi=22/7;
                    double hs = Luaslingkaran(r,phi);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double Luaslingkaran (double r, double phi){return phi*r*r;}
}
