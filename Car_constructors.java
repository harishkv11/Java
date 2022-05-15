public class Car_constructors {
    String make;
    String model;
    String color;
    int year;
    double price;

    Car_constructors(String make,String model,String color,int year,double price){
        this.make=make;
        this.model=model;
        this.color=color;
        this.year=year;
        this.price=price;
    }

    void drive(){
        System.out.println("You are driving "+this.make);
    }
    void brake(){
        System.out.println("You applied brakes of "+this.model);
    }
}
