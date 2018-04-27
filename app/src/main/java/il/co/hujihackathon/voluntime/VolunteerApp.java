package il.co.hujihackathon.voluntime;

import android.app.Application;

import com.google.firebase.FirebaseApp;


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
        Volunteer newVol = new Volunteer("mail@gmail.com", "pass", "myname");
        volunteerDB.addVolunteer(newVol);
//        Seeker s1 = new Seeker("shaked", "shaked@gmail.com", "kids",
//                20, 35,"holon","up to a year",2,"yes",2);
//        Seeker s2 = new Seeker("noam", "na@gmail.com", "",
//                20, 35,"Tel Aviv","up to a month",2,"no",6);
//        Seeker s3 = new Seeker("shaked", "shhsdsdsdhh@gmail.com", "kids",
//                20, 35,"Jerusalem","",2,"no",6);
//        Seeker s4 = new Seeker("shaked", "shhsdsdsdhh@gmail.com", "kids",
//                20, 35,"holon","up to a month",2,"no",6);
//        Seeker s5 = new Seeker("shaked", "shhsdsdsdhh@gmail.com", "kids",
//                20, 35,"Tel Aviv","up to a month",2,"no",6);
//        seekersDB.addSeeker(s1);
//        seekersDB.addSeeker(s2);
        VPrefrences vPrefrences = new VPrefrences("kids", "hulon",
                "yes", "up to a year",3,3, 1,33);
        vdb.addVDB(vPrefrences);
        //vPrefrences.bestMatch();
    }
}
