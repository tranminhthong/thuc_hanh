package Behaviors;

import Entities.ThiSinh;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh<T extends ThiSinh> {
    List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    public void update(String name, int sbd) {
        for (T t : list) {
            if (t.getSoBaoDanh() == sbd) {
                t.setTen(name);
            }
        }
    }

    public void delete(int sbd) {
        for (T t : list) {
            if (t.getSoBaoDanh() == sbd) {
                list.remove(t);
                break;
            }
        }
    }

    public T searchBySbd(int sbd) {
        for (T t : list) {
            if (t.getSoBaoDanh() == sbd) {
                return t;
            }
        }
        return null;
    }
}
