package il.co.hujihackathon.voluntime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import java.util.ArrayList;

import DBResults;

public class Description1 extends AppCompatActivity {

    ArrayList<String> descriptions = DBResults.getDescriptions();
    String d1 = descriptions.get(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description1);
        showAnswer();
    }

    public void showAnswer(){
        TextView tv = (TextView) findViewById(R.id.tv1);
        tv.setText(d1);
    }
}
