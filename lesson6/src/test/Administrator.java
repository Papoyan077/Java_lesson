package test;

public class Administrator extends Human {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(department);
    }
}
