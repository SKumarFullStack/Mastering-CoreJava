package org.master.java.compare;

import java.util.Comparator;

public class BookExternalComparator implements Comparator<UncomparableBook> {
    @Override
    public int compare(UncomparableBook book1, UncomparableBook book2) {
        return Integer.compare(book1.pageCount, book2.pageCount); // Comparing books by page count
    }
}
