package il.co.hujihackathon.voluntime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class vol extends AppCompatActivity {
    Spinner spinnertype, spinnerage, spinnerfreq, spinnerdays, spinnerhours, spinnerbus;

    String msg = "Android = ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vol);


            // create a adapter
            String[] type = {"with the elderly","with children/adolescents","cooking for others","renovations"};
//            String[] age = {"10-20","21-30","30-50","50+","doesn't matter"};
            String[] freq = {"one-time","up to one month","up to six month","up to a year"};
            String[] days = {"1","2","3","4","5","6","7"};
            String[] hours = {"up to 2 hours","2 to 4 hours","4 to 8 hours","8 to 12 hours"};
            String[] bus = {"yes","no"};
            ArrayAdapter<String> stringArrayAdapterType = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, type);
//            ArrayAdapter<String> stringArrayAdapterAge = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, age);
            ArrayAdapter<String> stringArrayAdapterFreq = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, freq);
            ArrayAdapter<String> stringArrayAdapterDays = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, days);
            ArrayAdapter<String> stringArrayAdapterHours = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, hours);
            ArrayAdapter<String> stringArrayAdapterBus = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, bus);


            // create a spinner
            spinnertype = (Spinner) findViewById(R.id.spinnertype);
            spinnerage = (Spinner) findViewById(R.id.spinnerage);
            spinnerfreq = (Spinner) findViewById(R.id.spinnerfreq);
            spinnerdays = (Spinner) findViewById(R.id.spinnerdays);
            spinnerhours = (Spinner) findViewById(R.id.spinnerhours);
            spinnerbus = (Spinner) findViewById(R.id.spinnerbus);

            // add adapter to spinner
            spinnertype.setAdapter(stringArrayAdapterType);
//            spinnerage.setAdapter(stringArrayAdapterAge);
            spinnerfreq.setAdapter(stringArrayAdapterFreq);
            spinnerdays.setAdapter(stringArrayAdapterDays);
            spinnerhours.setAdapter(stringArrayAdapterHours);
            spinnerbus.setAdapter(stringArrayAdapterBus);

            // create listener and add to spinner
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                // put code which recognize a selected element
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });

            Button submit = (Button) findViewById(R.id.submit);
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String interest = getSpinnerType();
                    String city = getCity();
                    String bus = getBus();
                    String howOften = getHowOften();
                    int weekDays = getWeekDays();
                    int[] weekHours = getWeekHours();
                    int age = getAge();
                    VPrefrences vp = new VPrefrences(interest, city,bus,howOften, weekDays,
                            weekHours[1], weekHours[0], age);
                    //TODO fix age
                    VDB.getInstance().addVDB(vp);

                }

            });
            submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            // TODO Auto-generated method stub
                Intent androidsolved_intent = new Intent(getApplicationContext(), Results.class);
                startActivity(androidsolved_intent);


            }
        });

        }

        public String getSpinnerType(){
            String value = spinnertype.getSelectedItem().toString();
//        int ageInt = Integer.parseInt(valueAge);
            Log.d(msg, value);
            return value;
        }

        public int getAge(){
            TextView age = (TextView) findViewById(R.id.age);
            String value = age.getText().toString();
            int ageInt = Integer.parseInt(value);
            Log.d(msg, value);
            return ageInt;
        }

        public String getCity(){
            TextView city = (TextView) findViewById(R.id.city);
            String value = city.getText().toString();
            Log.d(msg, value);
            return value;
        }
//
//        public String getName(){
//            TextView city = (TextView) findViewById(R.id.name);
//            String value = city.getText().toString();
//            Log.d(msg, value);
//            return value;
//        }

        public String getBus(){
            String value = spinnerbus.getSelectedItem().toString();
            Log.d(msg, value);
            return value;
        }

        public String getHowOften(){
            String value = spinnerfreq.getSelectedItem().toString();
            Log.d(msg, value);
            return value;
        }

        public int getWeekDays(){
            String value = spinnerdays.getSelectedItem().toString();
            int days = Integer.parseInt(value);
            Log.d(msg, value);
            return days;
        }

        public int[] getWeekHours(){
            int[] span = new int[2];
            String value = spinnerhours.getSelectedItem().toString();
            Log.d(msg, value);
            if (value.equals("up to 2 hours")){
                span[0] = 0;
                span[1] = 2;
            }
            if (value.equals("2 to 4 hours")){
                span[0] = 2;
                span[1] = 4;
            }
            if (value.equals("4 to 8 hours")){
                span[0] = 4;
                span[1] = 8;
            }
            if (value.equals("8 to 12 hours")){
                span[0] = 8;
                span[1] = 12;
            }
//            int returnValue = Integer.parseInt(value.substring(value.indexOf("o "), value.indexOf(" h")));
//            Log.d(msg, both[0]);
//            Log.d(msg, both[1]);
            return span;
        }

//    public void show(){
//        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
//    }

    }





