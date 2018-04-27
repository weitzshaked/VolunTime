package il.co.hujihackathon.voluntime;

import java.util.ArrayList;

public class VPrefrences {

    public String volunteering_area; // array with many strings..
    public String preferedLocation; // n.z for google maps
    public String publicTransportation; // 1 if yes, 0 otherwise
    public String frequency; // (1,1) if both frequencies, (1,0) if only on casual volunteering (0,1)
    // if only oneTimeThing volunteering
    public int days; // [1,0,0,0,0,1,0 - sun and friday
    public int minHours, maxHours; // hours per week
    public int age;


    public VPrefrences(String volunteering_area,String preferedLocation,
                       String publicTransportation, String frequency, int days, int maxHours, int minHours, int age){
        this.days = days;
        this.frequency = frequency;
        this.minHours = minHours;
        this.maxHours = maxHours;
        this.preferedLocation = preferedLocation;
        this.volunteering_area = volunteering_area;
        this. publicTransportation = publicTransportation;
        this.age = age;
        bestMatch();
    }

    public void bestMatch(){
        SeekersDB.getInstance().matchSeeker(this);
    }

}