package il.co.hujihackathon.voluntime;

import java.util.ArrayList;

public class Seeker {
    public String name, mail;
    public ArrayList<String> vulonteering_area;
    public int min_age_requsted, max_age_requsted, time_to_arrive;
    public int[] location;
    public int frequency;
    public ArrayList<Integer> days;
    public Boolean publicTransportation;


    public Seeker(String name, String mail, ArrayList<String> vulonteering_area,
                  int min_age_requsted, int max_age_requsted, int time_to_arrive,
                  int[] location, int frequency, ArrayList<Integer> days, boolean publicTransportation)
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
        this.publicTransportation = publicTransportation;
    }

    public String login() {
        return mail.substring(0, mail.indexOf("@"));
    }

    public void setPublicTransportation(Boolean publicTransportation) {
        this.publicTransportation = publicTransportation;
    }

    public String getName() {
        return name;
    }

    public Boolean getPublicTransportation() {
        return publicTransportation;
    }

    public String getMail() {
        return mail;
    }

    public ArrayList<String> getVulonteering_area() {
        return vulonteering_area;
    }

    public int getMin_age_requsted() {
        return min_age_requsted;
    }

    public int getMax_age_requsted() {
        return max_age_requsted;
    }

    public int getTime_to_arrive() {
        return time_to_arrive;
    }

    public int[] getLocation() {
        return location;
    }

    public int getFrequency() {
        return frequency;
    }

    public ArrayList<Integer> getDays() {
        return days;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setVulonteering_area(ArrayList<String> vulonteering_area) {
        this.vulonteering_area = vulonteering_area;
    }

    public void setMin_age_requsted(int min_age_requsted) {
        this.min_age_requsted = min_age_requsted;
    }

    public void setMax_age_requsted(int max_age_requsted) {
        this.max_age_requsted = max_age_requsted;
    }

    public void setTime_to_arrive(int time_to_arrive) {
        this.time_to_arrive = time_to_arrive;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setDays(ArrayList<Integer> days) {
        this.days = days;
    }
}