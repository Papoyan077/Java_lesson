package test;

public class Teacher extends Human {
    private String salary;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(salary);
    }
}
