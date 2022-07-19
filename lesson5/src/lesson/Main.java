package lesson;

import test.Car;
import test.Human;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setFirstName("David");
        human1.setLastName("Papoyan");
        human1.setGender('m');
        human1.setArmenian(true);
        human1.setYear(1996);

        Human human2 = new Human();
        human2.setFirstName("Aram");
        human2.setLastName("Aramyan");
        human2.setGender('m');
        human2.setArmenian(true);
        human2.setYear(1998);

        Car car1 = new Car();
        car1.setBrand("Mercedes");
        car1.setModel("C-class");
        car1.setEngine(6.3);
        car1.setYear(2014);

        Car car2 = new Car();
        car2.setBrand("BMW");
        car2.setModel("335");
        car2.setEngine(3.5);
        car2.setYear(2014);

        human1.sayHello();
        human1.printFullName();
        human2.printFullName();
        System.out.println(human1.fullName());
        human1.sum(4, 8);

        Car c = new Car();
        c.setEngine(-5.5);
        System.out.println(c.getEngine());


        String text = "Hello from lesson 5";
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.toUpperCase());
    }
}