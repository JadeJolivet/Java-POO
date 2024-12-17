package com.wildcodeschool;

public class Wilder {

    private String firstName;
    private Boolean aware;

    public Wilder(String firstName, Boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if(aware) {
            return "Je m'appelle " + firstName + " et je suis aware.";
        } else {
            return "Je m'appelle " + firstName + " et je ne suis pas aware.";
        }
    }
}
