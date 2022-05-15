public class Car_Objects {
    String make = "Tesla";
    String model = "S";
    int year = 2014;
    String color = "Black";
    double price = 60000000.00;

    void drive(){
        System.out.println("You are driving "+this.make);
    }
    
    void brakes(){
        System.out.println("Brakes are applied");
    }
}
