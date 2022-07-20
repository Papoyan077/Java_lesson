package test;

public class Student extends Human {
    private int age;

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Method Overloading
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(age);
    }
}
