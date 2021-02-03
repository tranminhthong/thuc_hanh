package Entities;

import java.util.List;

public class Card {
    private int id;
    private Student student;
    private List<Book> books;

    public Card(int id, Student student, List<Book> books) {
        this.id = id;
        this.student = student;
        this.books = books;
    }

    public Card() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", student=" + student +
                ", books=" + books +
                '}';
    }
}
