package il.co.hujihackathon.voluntime;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class VolunteerApp extends Application {

    public VolunteerDB volunteerDB;
    public SeekersDB seekersDB;
    public VDB vdb;


    @Override
    public void onCreate() {
        super.onCreate();

        // init your fb db
        FirebaseApp.initializeApp(this);
        volunteerDB = VolunteerDB.getInstance();
        seekersDB = SeekersDB.getInstance();
        vdb = VDB.getInstance();
    }
}
