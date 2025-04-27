package org.master.java.compare;

import java.util.Comparator;

class BookPageCountComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Integer.compare(book1.pageCount, book2.pageCount); // Comparing books by page count
    }
}
