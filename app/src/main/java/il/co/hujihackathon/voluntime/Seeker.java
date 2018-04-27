package il.co.hujihackathon.voluntime;

import java.util.ArrayList;

public class Seeker {
    public String name, mail;
    public String vulonteering_area;
    public int min_age_requsted, max_age_requsted;
    public String location;
    public String frequency;
    public int days, hours;
    public String publicTransportation;
    public String description;

    public Seeker() {

    }

    public Seeker(String name, String vulonteering_area,
                  int min_age_requsted, int max_age_requsted,
                  String location, String frequency, int days, String publicTransportation, int hours, String description)
    {
        this.days = days;
        this.name = name;
//        this.mail = mail;
        this.description = description;
        this.hours = hours;
        this.vulonteering_area = vulonteering_area;
        this.frequency = frequency;
        this.min_age_requsted = min_age_requsted;
        this.max_age_requsted = max_age_requsted;
        this.location = location;
        this.publicTransportation = publicTransportation;
    }

    public String login() {
        return this.name;
    }

    public String getDescription() {
        return description;
    }

    public void setPublicTransportation(String publicTransportation) {
        this.publicTransportation = publicTransportation;
    }

    public String getName() {
        return name;
    }

    public String getPublicTransportation() {
        return publicTransportation;
    }

    public String getMail() {
        return mail;
    }

    public String getVulonteering_area() {
        return vulonteering_area;
    }

    public int getMin_age_requsted() {
        return min_age_requsted;
    }

    public int getMax_age_requsted() {
        return max_age_requsted;
    }

    public String getLocation() {
        return location;
    }

    public String getFrequency() {
        return frequency;
    }

    public int getDays() {
        return days;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setVulonteering_area(String vulonteering_area) {
        this.vulonteering_area = vulonteering_area;
    }

    public void setMin_age_requsted(int min_age_requsted) {
        this.min_age_requsted = min_age_requsted;
    }

    public void setMax_age_requsted(int max_age_requsted) {
        this.max_age_requsted = max_age_requsted;
    }


    public void setLocation(String location) {
        this.location = location;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void setDays(int days) {
        this.days = days;
    }
}