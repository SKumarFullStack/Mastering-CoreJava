package org.master.java.compare;

public class Book implements Comparable<Book>{
    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    String title;
    int pageCount;

    // Constructor and other methods

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title); // Comparing books by title
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
