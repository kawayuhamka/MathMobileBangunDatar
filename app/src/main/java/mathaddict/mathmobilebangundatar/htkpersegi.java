package mathaddict.mathmobilebangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class htkpersegi extends AppCompatActivity {
    EditText s;
    Button hitung;
    TextView hasil;
    Button reset;
    public Button home;

    public void init1(){
        home=(Button)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy1= new Intent(htkpersegi.this,MainActivity.class);
                startActivity(toy1);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htkpersegi);
        reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.setText( String.valueOf(""));
                hasil.setText( String.valueOf("Hasil"));
            }
        });

        init1();
        s = (EditText) findViewById(R.id.sisi);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (s.length() == 0) {
                    Toast.makeText(getApplication(), "sisi tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else if (s.length() == 0) {
                    Toast.makeText(getApplication(), "sisi tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    String sisi = s.getText().toString();
                    double s = Double.parseDouble(sisi);
                    double hs = LuasPersegi(s);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());

                }
            }
        });
    }
    public double LuasPersegi (double s){return s*s;}
}
