package test;

public class Human {
    String firstName;
    String lastName;
    int year;
    boolean isArmenian;
    char gender;

    public void sayHello(){
        System.out.println(firstName+ " Say Hello");
    }
    public void printFullName(){
        System.out.println(firstName+" "+ lastName);
    }
    public String fullName(){
        return firstName+" "+lastName;
    }

    public void sum(int x, int y){
        System.out.println(x+y);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isArmenian() {
        return isArmenian;
    }

    public void setArmenian(boolean armenian) {
        isArmenian = armenian;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
