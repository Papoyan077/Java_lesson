package test;

public class Car {
    String model;
    String brand;
    double engine;
    int year;

    public double getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setEngine(double engine) {
        if(engine>0){
        this.engine = engine;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }
}
