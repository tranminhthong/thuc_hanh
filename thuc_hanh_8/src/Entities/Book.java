package Entities;

import java.io.Serializable;

public class Book extends Documents implements Serializable {
    private String author;
    private int numberOfPages;

    public Book() {
    }

    public Book(int code, String nameProducer, int issueNumber, String author, int numberOfPages) {
        super(code, nameProducer, issueNumber);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book: " +
                "author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages + ", " + super.toString();
    }
}
