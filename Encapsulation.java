public class Encapsulation {
    public static void main(String args[]){
        CarEn car = new CarEn();
        car.setter("BMW", 2011);
        car.getter();    
        System.out.println();
        
        CarEn car2 = new CarEn();
        car2.setter("Mercedes", 2005);
        car2.getter();
    }
}
