package il.co.hujihackathon.voluntime;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class SeekersDB {
    public FirebaseDatabase database;
    public DatabaseReference myRef;

    private static final SeekersDB ourInstance = new SeekersDB();

    public static SeekersDB getInstance() {
        return ourInstance;
    }

    private SeekersDB() {

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("SeekersDB");
    }

    public void addSeeker(String mail, String password, String name, int age){
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
