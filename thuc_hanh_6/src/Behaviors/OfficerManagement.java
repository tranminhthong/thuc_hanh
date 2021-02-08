package Behaviors;

import Enttities.Engineer;
import Enttities.Officers;
import Enttities.Staff;
import Enttities.Worker;

import java.util.ArrayList;
import java.util.List;

public class OfficerManagement<T extends Officers> {
    List<T> tList = new ArrayList<>();

    public void add(T t) {
        tList.add(t);
    }

    public void update(T t) {
        for (T t1 : tList) {
            if (t1.getId() == t.getId()) {
                t1.setName(t.getName());
                t1.setDateOfBirth(t.getDateOfBirth());
                t1.setGender(t.getGender());
                t1.setAddress(t.getAddress());
                if (t1 instanceof Worker && t instanceof Worker) {
                    ((Worker) t1).setLevel(((Worker) t).getLevel());
                } else if (t1 instanceof Staff && t instanceof Staff) {
                    ((Staff) t1).setWork(((Staff) t).getWork());
                } else if (t1 instanceof Engineer && t instanceof Engineer) {
                    ((Engineer) t1).setMajors(((Engineer) t).getMajors());
                }
            }
        }
    }

    public void delete(int id) {
        tList.removeIf(tt -> tt.getId() == id);
    }

    public T getOfficerByName(String name) {
        for (T t : tList) {
            if (t.getName().equals(name)) {
                return t;
            }
        }
        return null;
    }

    public void showAll() {
        if (tList.size()==0) System.out.println("null");
        for (T t : tList) {
            System.out.println(t.toString());
        }
    }

    public T search(int id) {
        if (tList.size()==0) return null;
        for (T t : tList) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public int calculateSalary(int id, int day, int bonus, int penalty) {
        for (T t1 : tList) {
            if (t1.getId() == id) {
                if (t1 instanceof Worker) {
                    return 8000000 * day / 30 + bonus - penalty;
                } else if (t1 instanceof Staff) {
                    return 10000000 * day / 30 + bonus - penalty;
                } else if (t1 instanceof Engineer) {
                    return 12000000 * day / 30 + bonus - penalty;
                }
            }
        }
        return 0;
    }

}
