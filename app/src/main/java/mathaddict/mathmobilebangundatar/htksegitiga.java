package mathaddict.mathmobilebangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class htksegitiga extends AppCompatActivity {
    EditText a,t;
    Button hitung;
    TextView hasil;
    Button reset;
    public Button home;

    public void init1(){
        home=(Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy1= new Intent(htksegitiga.this,MainActivity.class);
                startActivity(toy1);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htksegitiga);

        reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText( String.valueOf(""));
                t.setText( String.valueOf(""));
                hasil.setText( String.valueOf("Hasil"));
            }
        });



        init1();
        a = (EditText) findViewById(R.id.alas);
        t = (EditText) findViewById(R.id.tinggi);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (a.length() == 0 && t.length() ==0) {
                    Toast.makeText(getApplication(), "alas dan tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (a.length() == 0) {
                    Toast.makeText(getApplication(), "alas tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if (t.length() == 0) {
                    Toast.makeText(getApplication(), "tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    String alas = a.getText().toString();
                    String tinggi = t.getText() .toString();
                    double a = Double.parseDouble(alas);
                    double t = Double.parseDouble(tinggi);
                    double hs = Luasjajargenjang (a,t);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                    output = String.valueOf(hs);
                    hasil.setText(output.toString());

                }
            }
        });
    }public double Luasjajargenjang (double a, double t){return a*t/2;}
}
