public class Constructors {
    public static void main(String args[]){
        Car_constructors car = new Car_constructors("Tesla",
        "S", "Red", 2014  , 50000000.00);

        Car_constructors car2 = new Car_constructors("Maruti", 
        "Swift", "Grey", 2008 , 600000.00);

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);
        System.out.println(car.price);
        car.drive();
        car.brake();

        System.out.println();

        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.year);
        System.out.println(car2.price);
        car2.drive();
        car2.brake();
    }
}
