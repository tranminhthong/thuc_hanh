package Behaviors;

import Entities.Officer;
import Entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class OfficerManagement {
    static List<Officer> officers = new ArrayList<>();

    public void addOfficer(Officer officer) {
        officers.add(officer);
    }

    public void update(String name, int id) {
        for (Officer o : officers) {
            if (o.getTeacher().getId() == id) {
                o.getTeacher().setName(name);
            }
        }
    }

    public void delete(int id) {
        for (Officer o : officers) {
            if (o.getTeacher().getId() == id) {
                officers.remove(o);
                break;
            }
        }
    }

    public Teacher showTeacher(int id) {
        Teacher teacher = null;
        for (Officer officer : officers) {
            if (officer.getTeacher().getId() == id) {
                teacher = officer.getTeacher();
                break;
            }
        }
        return teacher;
    }

    public void showAll() {
        for (Officer o : officers) {
            System.out.println(o.getTeacher().toString());
        }
    }

    public int calculateSalaryById(int id) {
        int realSalary = 0;
        for (Officer o : officers) {
            if (o.getTeacher().getId() == id) {
                realSalary = o.getRealSalary();
                break;
            }
        }
        return realSalary;
    }

    public void showSalaryAll() {
        for (Officer o : officers) {
            System.out.println(o.toString());
        }
    }

    public void displayOfficerSalaryGreater8million() {
        for (Officer o : officers) {
            if (o.getRealSalary() >= 8000000) {
                System.out.println(o.toString());
            }
        }
    }
}
