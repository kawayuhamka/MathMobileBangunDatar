package mathaddict.mathmobilebangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class bukaquis extends AppCompatActivity {
    public Button quis;

    public void init1(){
        quis= (Button)findViewById(R.id.b1);
        quis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy1= new Intent(bukaquis.this,QuizActivity.class);
                startActivity(toy1);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukaquis);
        init1();
    }
}
