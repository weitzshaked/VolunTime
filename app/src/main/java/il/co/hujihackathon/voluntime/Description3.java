package il.co.hujihackathon.voluntime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Description3 extends AppCompatActivity {

    ArrayList<String> descriptions = DBResults.getDescriptions();
    String d3 = descriptions.get(2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description3);
        showAnswer();
    }
    public void showAnswer(){
        TextView tv = (TextView) findViewById(R.id.tv3);
        tv.setText(d3);
    }
}
