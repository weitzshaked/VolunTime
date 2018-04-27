package il.co.hujihackathon.voluntime;

import java.util.ArrayList;


public class DBResults {
    public DBResults(){}
    public static ArrayList<String> getNamesOfResults(){
            ArrayList<String> results = new ArrayList<>();

        for (Seeker seeker: SeekersDB.getInstance().getSeekerslist()) {
            results.add(seeker.getName());
        }
        return results;
    }

    public static ArrayList<String> getDescriptions(){
        ArrayList<String> results = new ArrayList<>();

        for (Seeker seeker: SeekersDB.getInstance().getSeekerslist()) {
            results.add(seeker.getDescription());
        }
        return results;
    }

}
