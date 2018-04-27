package il.co.hujihackathon.voluntime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import il.co.hujihackathon.voluntime.DBResults;

import java.util.ArrayList;

public class Description2 extends AppCompatActivity {

    ArrayList<String> descriptions = DBResults.getDescriptions();
    String d2 = descriptions.get(1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description2);
        showAnswer();
    }

    public void showAnswer(){
        TextView tv = (TextView) findViewById(R.id.tv2);
        tv.setText(d2);
    }
}
