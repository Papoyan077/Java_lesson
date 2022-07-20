package test;

public class Car {
    private String number;
    private int year;

    public Car(String number, int year) {
        this.number = number;
        this.year = year;
    }
    public Car(){

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
