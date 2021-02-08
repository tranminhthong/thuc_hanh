package Behaviors;

import Entities.Student;

import java.util.ArrayList;

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(Student student) {
        for (Student student1 : students) {
            if (student1.getId() == student.getId()) {
                student1.setName(student.getName());
                student1.setClassName(student.getClassName());
            }
        }
    }

    public void deleteStudent(int id) {
        students.removeIf(st -> st.getId() == id);
    }

    public Student getStudentById(int id) {
        Student student = new Student();
        for (Student st : students) {
            if (st.getId() == id) {
                student = st;
            }
        }
        return student;
    }

    public void showAllStudent() {
        for (Student st : students) {
            System.out.println(st.toString());
        }
    }
}
