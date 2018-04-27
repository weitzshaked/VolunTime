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
//        Seeker s1 = new Seeker("shaked", "with children/adolescents",
//                20, 35,"holon","up to a year",2,"yes",4, "looking for someone too help with homework. 0544444444");
//        Seeker s2 = new Seeker("noam", "with the elderly",
//                20, 35,"Tel Aviv","up to a month",2,"no",6, "looking for company");
//        Seeker s3 = new Seeker("gali", "with children/adolescents",
//                20, 35,"Jerusalem","4",2,"no",1, "please help walk kids back from school");
//        Seeker s4 = new Seeker("shimmy", "cooking for others", 16,
//                40, "holon","up to a month",7,"no",1, "somone to help me cook");
//        seekersDB.addSeeker(s2);
//        seekersDB.addSeeker(s3);
//        seekersDB.addSeeker(s4);
//        VPrefrences vPrefrences = new VPrefrences("kids", "hulon",
//                "yes", "up to a year",3,3, 1,33);
//        vdb.addVDB(vPrefrences);
//        seekersDB.addSeeker(s1);
        //vPrefrences.bestMatch();
    }
}
