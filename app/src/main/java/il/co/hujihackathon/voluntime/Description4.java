package il.co.hujihackathon.voluntime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Description4 extends AppCompatActivity {

    ArrayList<String> descriptions = DBResults.getDescriptions();
    String d4 = descriptions.get(3);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description4);
        showAnswer();
    }
    public void showAnswer(){
        TextView tv = (TextView) findViewById(R.id.tv4);
        tv.setText(d4);
    }
}
