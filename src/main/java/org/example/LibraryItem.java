package org.example;

abstract public class LibraryItem {
    public String title;
    public String creator;
    public int yearReleased;

    public LibraryItem(String title, String creator, int yearReleased) {
        this.title = title;
        this.creator = creator;
        this.yearReleased = yearReleased;
    }


    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.creator;
    }

    public int getYear() {
        return this.yearReleased;
    }


    @Override
    public String toString() {
        return title + " by " + creator + " (" + yearReleased + ")";
    }

}
