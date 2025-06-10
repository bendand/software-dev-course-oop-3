package org.example;

public class Album extends LibraryItem {
    public int numberOfTracks;

    public Album(String title, String creator, int yearReleased, int numberOfTracks) {
        super(title, creator, yearReleased);
        this.numberOfTracks = numberOfTracks;
    }

    public int getTrackCount() {
        return numberOfTracks;
    }

    @Override
    public String toString() {
        return "Album: " + super.toString() + " - " + numberOfTracks + " tracks";
    }
}
