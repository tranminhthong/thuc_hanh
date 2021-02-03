package Behaviors;

import Entities.Book;

import java.util.ArrayList;

public class BookManagement {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateBook(Book book) {
        for (Book b : books) {
            if (b.getId() == book.getId()) {
                b.setName(book.getName());
            }
        }
    }

    public void deleteBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
            }
        }
    }

    public Book getBookById(int id) {
        Book b = new Book();
        for (Book book : books) {
            if (book.getId() == id) {
                b = book;
            }
        }
        return b;
    }

    public void showAllBook() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
