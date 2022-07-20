import test.Administrator;
import test.Car;
import test.Student;
import test.Teacher;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("David");
        s1.setAge(26);
        s1.setYear(2000);
        s1.setPhone(1999777);

        Car c=new Car("10XY077",2012);
        s1.sum(4,5);

        Teacher t =new Teacher();
        t.setName("gohar");
        t.setYear(2000);
        t.setPhone(1999777);
        t.setSalary("1000$");

        Administrator a =new Administrator();
        a.setName("gvidon");
        a.setYear(1999);
        a.setPhone(1999777);
        a.setDepartment("chaguch");
        System.out.println("--------");
        s1.printInfo();
        System.out.println("--------");
        t.printInfo();
        System.out.println("--------");
        a.printInfo();

    }
}