package org.master.java.compare;

public class UncomparableBook{
    public UncomparableBook(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    String title;
    int pageCount;

    // Constructor and other method



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

}
