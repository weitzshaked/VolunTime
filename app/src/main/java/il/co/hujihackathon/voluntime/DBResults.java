package il.co.hujihackathon.voluntime;

import java.util.ArrayList;


public class DBResults {
    public DBResults(){}
    public ArrayList<String> getNamesOfResults(){
            ArrayList<String> results = new ArrayList<>();

        for (Seeker seeker: SeekersDB.getInstance().seekerslist) {
            results.add(seeker.getName());
        }
        return results;
    }

    public ArrayList<String> getDescriptions(){
        ArrayList<String> results = new ArrayList<>();

        for (Seeker seeker: SeekersDB.getInstance().seekerslist) {
            results.add(seeker.getDescription());
        }
        return results;
    }

}
