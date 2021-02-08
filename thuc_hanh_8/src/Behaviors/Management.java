package Behaviors;

import Entities.Documents;

import java.util.ArrayList;
import java.util.List;

public class Management<T extends Documents> {
    List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    public void update(String nameProducer, int code) {
        for (T t : list) {
            if (t.getCode() == code) {
                t.setNameProducer(nameProducer);
            }
        }
    }

    public void delete(int code) {
        for (T t : list) {
            if (t.getCode() == code) {
                list.remove(t);
                break;
            }
        }
    }

    public void show() {
        for (T t : list) {
            System.out.println(t);
        }
    }

    public T searchDocumentByCode(int code) {
        for (T t : list) {
            if (t.getCode() == code) {
                return t;
            }
        }
        return null;
    }
}
