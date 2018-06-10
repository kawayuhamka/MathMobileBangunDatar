package mathaddict.mathmobilebangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class htklayanglayang extends AppCompatActivity {
    EditText d1,d2;
    Button hitung;
    TextView hasil;
    Button reset;
    public Button home;

    public void init1(){
        home=(Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy1= new Intent(htklayanglayang.this,MainActivity.class);
                startActivity(toy1);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htklayanglayang);
        reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1.setText( String.valueOf(""));
                d2.setText( String.valueOf(""));
                hasil.setText( String.valueOf("Hasil"));
            }
        });

        init1();
        d1 = (EditText) findViewById(R.id.diagonal1);
        d2 = (EditText) findViewById(R.id.diagonal2);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (d1.length() == 0 && d2.length() ==0) {
                    Toast.makeText(getApplication(), "Diagonal 1 dan Diagonal 2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (d1.length() == 0) {
                    Toast.makeText(getApplication(), "Diagonal 1 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else if (d2.length() == 0) {
                    Toast.makeText(getApplication(), "Diagoanl 2 tidak boleh kosong", Toast.LENGTH_LONG).show();
                }else {
                    String diagonal1 = d1.getText().toString();
                    String diagonal2 = d2.getText() .toString();
                    double d1 = Double.parseDouble(diagonal1);
                    double d2 = Double.parseDouble(diagonal2);
                    double hs = Luaslayanglayang (d1,d2);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                    output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }public double Luaslayanglayang (double d1, double d2){return (d1*d2)/2 ;}
}
