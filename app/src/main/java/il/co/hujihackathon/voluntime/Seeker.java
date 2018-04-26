package il.co.hujihackathon.voluntime;

import java.util.ArrayList;

public class Seeker {
    public String name, mail;
    public ArrayList<String> vulonteering_area;
    public int min_age_requsted, max_age_requsted, time_to_arrive;
    public int[] location;
    public int frequency;
    public ArrayList<Integer> days;

    public Seeker(String name, String mail, ArrayList<String> vulonteering_area,
                  int min_age_requsted, int max_age_requsted, int time_to_arrive,
                  int[] location, int frequency, ArrayList<Integer> days)
    {
        this.days = days;
        this.name = name;
        this.mail = mail;
        this.vulonteering_area = vulonteering_area;
        this.time_to_arrive = time_to_arrive;
        this.frequency = frequency;
        this.min_age_requsted = min_age_requsted;
        this.max_age_requsted = max_age_requsted;
        this.location = location;

    }
}