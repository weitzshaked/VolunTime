package il.co.hujihackathon.voluntime;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


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
    }

    public void addVolunteer(Volunteer volunteer){
        myRef.child(volunteer.login()).setValue(volunteer);
    }
}
