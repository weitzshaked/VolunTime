package il.co.hujihackathon.voluntime;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class VDB {
    public FirebaseDatabase database;
    public DatabaseReference myRef;

    private static final VDB ourInstance = new VDB();

    public static VDB getInstance() {
        return ourInstance;
    }

    private VDB() {
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("VDB");

    }
}
