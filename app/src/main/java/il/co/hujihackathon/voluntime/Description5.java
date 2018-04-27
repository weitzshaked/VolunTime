package il.co.hujihackathon.voluntime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import DBResults;
import java.util.ArrayList;

public class Description5 extends AppCompatActivity {

    ArrayList<String> descriptions = DBResults.getDescriptions();
    String d5 = descriptions.get(4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description5);
        showAnswer();
    }
    public void showAnswer(){
        TextView tv = (TextView) findViewById(R.id.tv5);
        tv.setText(d5);
    }
}
