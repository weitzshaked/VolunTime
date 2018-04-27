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

    public void addSeeker(Seeker seeker){
        myRef.child(seeker.login()).setValue(seeker);
    }
}
