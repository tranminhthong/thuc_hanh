public class Person {
    private String name;
    private int age;
    private int identity;

    public Person() {
    }

    public Person(String name, int age, int identity) {
        this.name = name;
        this.age = age;
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return getName() + ": " + getAge() + " tuổi, CMND: " + getIdentity();
    }
}
