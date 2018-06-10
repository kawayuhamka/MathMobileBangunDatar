package mathaddict.mathmobilebangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class htkpersegipanjang extends AppCompatActivity {
    EditText p,l;
    Button hitung;
    TextView hasil;
    Button reset;
    public Button home;

    public void init1(){
        home=(Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy1= new Intent(htkpersegipanjang.this,MainActivity.class);
                startActivity(toy1);

            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htkpersegipanjang);
        reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p.setText( String.valueOf(""));
                l.setText( String.valueOf(""));
                hasil.setText( String.valueOf("Hasil"));
            }
        });

        init1();
        p = (EditText) findViewById(R.id.panjang);
        l = (EditText) findViewById(R.id.lebar);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (p.length() == 0 && l.length() ==0) {
                    Toast.makeText(getApplication(), "panjang dan lebar tidak boleh kososng", Toast.LENGTH_LONG).show();
                } else if (p.length() == 0) {
                    Toast.makeText(getApplication(), "panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }else if (p.length() == 0) {
                    Toast.makeText(getApplication(), "panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }else {
                    String panjang = p.getText().toString();
                    String lebar = l.getText() .toString();
                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    double hs = Luaspersegipanjang (p,l);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                    output = String.valueOf(hs);
                    hasil.setText(output.toString());

                }
            }
        });
    }public double Luaspersegipanjang (double p, double l){return p*l;}


}
