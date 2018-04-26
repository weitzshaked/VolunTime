package il.co.hujihackathon.voluntime;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class VolunteerDB {
    private static final VolunteerDB ourInstance = new VolunteerDB();

    public static VolunteerDB getInstance() {
        return ourInstance;
    }
    // Write a message to the database

    public FirebaseDatabase database;
    public DatabaseReference myRef;


    private VolunteerDB(){
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("VolunteerDB");

        addVolunteer("2","3","4",3);
    }

    public void addVolunteer(String mail, String password, String name, int age){
        myRef.child("Testing").setValue("hi it's working!");

        HashMap<String, Object> myMap = new HashMap<>();
        myMap.put("a", true);
        myMap.put("b", 1);
        myMap.put("c", "asdansdalsd");
        myMap.put("d", "null");

        myRef.child("some_other_test").setValue(myMap);
        myRef.child("some_other_test2").setValue(myMap);
    }

}
