package org.master.java.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareDemo {

    public static void main(String[] args) {
        compareDemo();
        uncompareableDemo();
    }

    private static void compareDemo() {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("Tiger Zinda Hain", 100);
        Book book2 = new Book("Tiger Abhi Zinda Hain", 1000);
        Book book3 = new Book("Tiger Kyu Zinda Hain", 300);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        System.out.println("Before Sorting : " + books);
        Collections.sort(books);
        System.out.println("After Sorting : " + books);
    }

    private static void uncompareableDemo() {
        List<UncomparableBook> books = new ArrayList<>();
        UncomparableBook book1 = new UncomparableBook("Tiger Zinda Hain", 100);
        UncomparableBook book2 = new UncomparableBook("Tiger Abhi Zinda Hain", 1000);
        UncomparableBook book3 = new UncomparableBook("Tiger Kyu Zinda Hain", 300);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        System.out.println("Before Sorting : " + books);
        //Below line will show compile time issues
        //Collections.sort(books);

        Collections.sort(books,new BookExternalComparator());
        //Comparator rankBooks = (UncomparableBook player1, UncomparableBook player2) -> Integer.compare(player1.pageCount, player2.pageCount);
        Comparator rankBooks = Comparator.comparing(UncomparableBook::getPageCount);
                //Collections.sort(books,rankBooks);
        System.out.println("After Sorting : " + books);
    }


}
