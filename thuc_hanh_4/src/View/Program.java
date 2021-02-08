package View;

import Behaviors.BookManagement;
import Behaviors.CardManagement;
import Behaviors.StudentManagement;
import Entities.Book;
import Entities.Card;
import Entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static BookManagement bm = new BookManagement();
    static StudentManagement sm = new StudentManagement();
    static CardManagement cm = new CardManagement();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        startMenu:
        do {
            System.out.print("-----------Menu-----------" +
                    "\n1: Student Management" +
                    "\n2: Book Management" +
                    "\n3: Card Management" +
                    "\nEnter your choice: ");
            try {
                int choice1 = Integer.parseInt(sc.nextLine());
                switch (choice1) {
                    case 1:
                        do {
                            System.out.print("------Student Management-------" +
                                    "\n1: Add student" +
                                    "\n2: Update student" +
                                    "\n3: Delete student" +
                                    "\n4: Display a student" +
                                    "\n5: Show all student" +
                                    "\n0: Back" +
                                    "\nEnter choice: ");

                            try {
                                int choice2 = Integer.parseInt(sc.nextLine());
                                switch (choice2) {
                                    case 1:
                                        Student student = Menus.getInfoStudent();
                                        sm.addStudent(student);
                                        break;
                                    case 2:
                                        Student student1 = Menus.getInfoStudent();
                                        sm.updateStudent(student1);
                                        break;
                                    case 3:
                                        System.out.print("Enter student's id: ");
                                        int id = Integer.parseInt(sc.nextLine());
                                        sm.deleteStudent(id);
                                        break;
                                    case 4:
                                        System.out.print("Enter student's id: ");
                                        int id1 = Integer.parseInt(sc.nextLine());
                                        System.out.println(sm.getStudentById(id1).toString());
                                        break;
                                    case 5:
                                        sm.showAllStudent();
                                        break;
                                    case 0:
                                        continue startMenu;
                                    default:
                                        System.err.println("Enter error. Try again.");
                                }
                            } catch (Exception e) {
                                System.err.println("Enter error");
                            }
                        } while (true);
                    case 2:
                        do {
                            System.out.println("--------Book Management--------" +
                                    "\n1: Add book" +
                                    "\n2: Update book" +
                                    "\n3: Delete book" +
                                    "\n4: Display a book" +
                                    "\n5: Show all book" +
                                    "\n0: Back");
                            try {
                                int choice3 = Integer.parseInt(sc.nextLine());
                                switch (choice3) {
                                    case 1:
                                        Book book = Menus.getInfoBooK();
                                        bm.addBook(book);
                                        break;
                                    case 2:
                                        Book book1 = Menus.getInfoBooK();
                                        bm.updateBook(book1);
                                        break;
                                    case 3:
                                        System.out.print("Enter book's id: ");
                                        int id = Integer.parseInt(sc.nextLine());
                                        bm.deleteBook(id);
                                        break;
                                    case 4:
                                        System.out.print("Enter book's id: ");
                                        int id1 = Integer.parseInt(sc.nextLine());
                                        System.out.println(bm.getBookById(id1).toString());
                                        break;
                                    case 5:
                                        bm.showAllBook();
                                        break;
                                    case 0:
                                        continue startMenu;
                                    default:
                                        System.err.print("Enter error. Try again");
                                }
                            } catch (Exception e) {
                                System.err.print("Enter error. Try again");
                            }
                        } while (true);
                    case 3:
                        do {
                            System.out.print("------Card Management-------" +
                                    "\n1: Add a card" +
                                    "\n2: Display a card" +
                                    "\n3: Display all card" +
                                    "\n0: Back" +
                                    "\nEnter choice: ");
                            try {
                                int choice4 = Integer.parseInt(sc.nextLine());
                                switch (choice4) {
                                    case 1:
                                        ArrayList<Book> books = new ArrayList<>();
                                        System.out.print("Enter card's id: ");
                                        int id = Integer.parseInt(sc.nextLine());
                                        System.out.print("Enter student's id: ");
                                        int ids = Integer.parseInt(sc.nextLine());
                                        Student st = sm.getStudentById(ids);
                                        System.out.print("Enter quantity book you want to borrow: ");
                                        int quantity = Integer.parseInt(sc.nextLine());
                                        for (int i = 0; i < quantity; i++) {
                                            System.out.println("Enter book's id");
                                            int idb = Integer.parseInt(sc.nextLine());
                                            Book b = bm.getBookById(idb);
                                            books.add(b);
                                        }
                                        Card card = new Card(id, st, books);
                                        cm.addCard(card);
                                        break;
                                    case 2:
                                        System.out.print("Enter card's id: ");
                                        int idc = Integer.parseInt(sc.nextLine());
                                        System.out.println(cm.getCardById(idc).toString());
                                        break;
                                    case 3:
                                        cm.showAllCard();
                                        break;
                                    case 0:
                                        continue startMenu;
                                    default:
                                        System.err.println("Enter error. Try again");
                                }
                            } catch (Exception e) {
                                System.err.println("Enter error");
                            }
                        } while (true);
                }
            } catch (Exception e) {
                System.err.println("Enter Error");
            }
        } while (true);
    }
}
