package il.co.hujihackathon.voluntime;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class VolunteerDB {

    public VolunteerDB(){
        addVolunteer("2","3","4",3);
    }
    // Write a message to the database
    FirebaseDatabase database = FirebaseDatabase.getInstance("https://console.firebase.google.com/project/voluntime-8be6f/database/firestore/data~2FVolunteersDB~2F1E7VWPcDypgzd1ZtksAU");
    DatabaseReference myRef = database.getReference();

    public void addVolunteer(String mail, String password, String name, int age){
        myRef.getDatabase();
    }
    public int main(){
        VolunteerDB v = new VolunteerDB();
        return 0;
    }

}
