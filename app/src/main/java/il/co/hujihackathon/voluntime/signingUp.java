package il.co.hujihackathon.voluntime;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class signingUp extends AppCompatActivity {






        Button button1;
        String msg = "Android = ";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_signing_up);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

            button1 = (Button) findViewById(R.id.button5);
            button1.setOnClickListener(new View.OnClickListener() {


                @Override
                public void onClick(View v) {
// TODO Auto-generated method stub

                    String mail = getmail();
                    String password = getPassword();
                    String name = getName();
                    Volunteer volunteer = new Volunteer(mail, password, name);
                    VolunteerDB.getInstance().addVolunteer(volunteer);
                    Intent androidsolved_intent1 = new Intent(getApplicationContext(), Who.class);
                    startActivity(androidsolved_intent1);

                }


            });
        }

    public String getName() {
        TextView mail = (TextView) findViewById(R.id.editText2);
        String value = mail.getText().toString();
//        Log.d(msg, value);
        return value;
    }

        public String getmail() {
            TextView mail = (TextView) findViewById(R.id.editText4);
            String value = mail.getText().toString();
//            Log.d(msg, value);
            return value;
        }

        public  String getPassword(){
            TextView password = (TextView) findViewById(R.id.editText6);
            String value = password.getText().toString();
//            Log.d(msg, value);
            return value;
        }
    }


