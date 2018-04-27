package il.co.hujihackathon.voluntime;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class VDB {
    public FirebaseDatabase database;
    public DatabaseReference myRef;
    public int count = 1;

    private static final VDB ourInstance = new VDB();

    public static VDB getInstance() {
        return ourInstance;
    }

    private VDB() {
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("VDB");

    }

    public void addVDB(VPrefrences vp){
        myRef.child(String.valueOf(count)).setValue(vp);
        count++;
    }
}
