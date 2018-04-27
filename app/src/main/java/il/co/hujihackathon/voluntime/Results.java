package il.co.hujihackathon.voluntime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import DBResults;

import java.util.ArrayList;

public class Results extends AppCompatActivity {

    ArrayList<String> names = DBResults.getNamesOfResults();

    Button r1,r2,r3,r4,r5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        r1=(Button) findViewById(R.id.result1);
        r1.setText(names.get(0));
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent first = new Intent(getApplicationContext(),Description1.class);
                startActivity(first);

            }
        });

        r2=(Button) findViewById(R.id.result2);
        r2.setText(names.get(1));
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent first = new Intent(getApplicationContext(),Description2.class);
                startActivity(first);

            }
        });

        r3=(Button) findViewById(R.id.result3);
        r3.setText(names.get(2));
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent first = new Intent(getApplicationContext(),Description3.class);
                startActivity(first);

            }
        });

        r4=(Button) findViewById(R.id.result4);
        r4.setText(names.get(3));
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent first = new Intent(getApplicationContext(),Description4.class);
                startActivity(first);

            }
        });

        r5=(Button) findViewById(R.id.result5);
        r5.setText(names.get(4));
        r5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                Intent first = new Intent(getApplicationContext(),Description5.class);
                startActivity(first);

            }
        });
    }
}
