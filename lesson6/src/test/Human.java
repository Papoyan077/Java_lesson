package test;

public class Human {
    private String name;
    private int year;
    private int phone;

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo(){
        System.out.println(name + " name;");
        System.out.println(year + " year;");
        System.out.println(phone+ " phone;" );
    }
}
