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
    static public ArrayList<Seeker> seekerslist;


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
        Seeker s4 = new Seeker("shimmy", "cooking for others", 16, 40, "holon","up to a month",7,"no",1, "cook for my children 09-7777777");
        Seeker s2 = new Seeker("noam", "with the elderly",
                20, 35,"Tel Aviv","up to a month",2,"no",6, "looking for company. 0547894563");
        Seeker s3 = new Seeker("gali", "with children/adolescents",
                20, 35,"Jerusalem","4",2,"no",1, "please help walk kids back from school. 0504564445");
        Seeker s5 = new Seeker("emmanuel", "cooking for others", 16,
                40, "holon","up to a month",7,"no",1, "somone to help me cook. 0522222222");
        Seeker s1 = new Seeker("shaked", "with children/adolescents",
                20, 35,"holon","up to a year",2,"yes",4, "looking for someone too help with homework. 0544444444");
        seekerslist.add(s4);
        seekerslist.add(s1);
        seekerslist.add(s2);
        seekerslist.add(s3);
        seekerslist.add(s5);

    }

    public void addSeeker(Seeker seeker){
        myRef.child(seeker.login()).setValue(seeker);
    }
    public void setCurVP(VPrefrences vp){this.vp = vp;}

    public void matchSeeker(VPrefrences vPrefrences){
        this.setCurVP(vPrefrences);
//        myRef.addValueEventListener(postListener);

    }
}
