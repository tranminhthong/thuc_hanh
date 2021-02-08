package Entities;

public class Officer {
    private int basicSalary;
    private int bonus;
    private int penalty;
    private Teacher teacher;

    public Officer() {
    }

    public Officer(int basicSalary, int bonus, int penalty, Teacher teacher) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.penalty = penalty;
        this.teacher = teacher;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getRealSalary() {
        return basicSalary + bonus - penalty;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Teacher " + teacher.getName() + " id = " + teacher.getId() + ", has total salary = " + getRealSalary();
    }
}
