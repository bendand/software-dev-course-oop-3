package org.example;

public class Book extends LibraryItem {
    public int pageCount;

    public Book(String title, String creator, int yearReleased, int pageCount) {
        super(title, creator, yearReleased);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public static void readBook() {
        System.out.println("book read!");
    }

    @Override
    public String toString() {
        return "Book: " + super.toString() + " - " + pageCount + " pages";
    }
}
