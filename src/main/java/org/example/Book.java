package org.example;

public class Book extends LibraryItem {
    private int pageCount;

    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void readBook() {
        System.out.println("Reading \"" + getTitle() + "\" by " + getCreator() + "...");
    }

    public String toString() {
        return "Book: " + getTitle() + " by " + getCreator() + " (" + getYear() + ") - " + pageCount + " pages";
    }
}
