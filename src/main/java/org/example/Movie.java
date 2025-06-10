package org.example;

public class Movie extends LibraryItem {
    public int runtimeMinutes;

    public Movie(String title, String creator, int yearReleased, int runtimeMinutes) {
        super(title, creator, yearReleased);
        this.runtimeMinutes = runtimeMinutes;
    }

    public int getDurationInMinutes() {
        return runtimeMinutes;
    }

    @Override
    public String toString() {
        return "Movie: " + super.toString() + " - " + runtimeMinutes + " minutes";
    }
}
