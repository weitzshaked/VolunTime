package il.co.hujihackathon.voluntime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent androidsolved_intent1 = new Intent(getApplicationContext(), signin.class);
                startActivity(androidsolved_intent1);


            }


        });
//
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent androidsolved_intent2 = new Intent(getApplicationContext(), signingUp.class);
                startActivity(androidsolved_intent2);


            }
        });
    }
}

