package Behaviors;

import Entities.Documents;

import java.util.ArrayList;

public class Management<T extends Documents> {
    ArrayList<T> list;
    private static final String FILE_PATH = "C:\\Users\\thait\\OneDrive\\Desktop\\thuc_hanh\\thuc_hanh_8\\src\\library.dat";

    public void add(T t) {
        list = (ArrayList<T>) FileProcess.readFromFile(FILE_PATH);
        list.add(t);
        FileProcess.writeObjectToFile(list, FILE_PATH);
    }

    public void update(String nameProducer, int code) {
        list = (ArrayList<T>) FileProcess.readFromFile(FILE_PATH);
        for (T t : list) {
            if (t.getCode() == code) {
                t.setNameProducer(nameProducer);
                break;
            }
        }
        FileProcess.writeObjectToFile(list, FILE_PATH);
    }

    public void delete(int code) {
        list = (ArrayList<T>) FileProcess.readFromFile(FILE_PATH);
        list.removeIf(t -> t.getCode() == code);
        FileProcess.writeObjectToFile(list, FILE_PATH);
    }

    public void show() {
        list = (ArrayList<T>) FileProcess.readFromFile(FILE_PATH);
        if (list.size() == 0) System.out.println("null");
        for (T t : list) {
            System.out.println(t);
        }
    }

    public T searchDocumentByCode(int code) {
        list = (ArrayList<T>) FileProcess.readFromFile(FILE_PATH);
        for (T t : list) {
            if (t.getCode() == code) {
                return t;
            }
        }
        return null;
    }

    public void checkCode(int code) throws Exception {
        list = (ArrayList<T>) FileProcess.readFromFile(FILE_PATH);
        for (T t : list) {
            if (t.getCode() == code) {
                System.out.println("Code existed!");
                throw new Exception();
            }
        }
    }
}
