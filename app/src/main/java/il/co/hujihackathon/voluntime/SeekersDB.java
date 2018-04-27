package il.co.hujihackathon.voluntime;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SeekersDB {
    public FirebaseDatabase database;
    public DatabaseReference myRef;
    public VPrefrences vp;
    public ArrayList<Seeker> seekerslist;


    public ValueEventListener postListener = new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            Seeker s;
            // Get Post object and use the values to update the UI
            for (DataSnapshot childSnapshot: dataSnapshot.getChildren()) {
                s = childSnapshot.getValue(Seeker.class);
                if(( s.hours <= vp.maxHours &&  s.hours >= vp.minHours) && s.days == vp.days &&
                        s.frequency.equals(vp.frequency) && s.location.equals(vp.preferedLocation)
                        && (s.max_age_requsted >= vp.age && s.min_age_requsted <= vp.age) &&
                        s.vulonteering_area.equals(vp.volunteering_area)){
                    seekerslist.add(s);
                }
            }
            // ...
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {
            // Getting Post failed, log a message
            Log.w("Hello", "loadPost:onCancelled", databaseError.toException());
            // ...
        }
    };

    private static final SeekersDB ourInstance = new SeekersDB();

    public static SeekersDB getInstance() {
        return ourInstance;
    }

    public ArrayList<Seeker> getSeekerslist() {
        return seekerslist;
    }

    private SeekersDB() {


        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("SeekersDB");
        this.seekerslist = new ArrayList<>();


    }

    public void addSeeker(Seeker seeker){
        myRef.child(seeker.login()).setValue(seeker);
    }
    public void setCurVP(VPrefrences vp){this.vp = vp;}

    public void matchSeeker(VPrefrences vPrefrences){
        this.setCurVP(vPrefrences);
        myRef.addValueEventListener(postListener);

    }
}
