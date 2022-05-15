public class inheritance {
    public static void main(String args[]){
        CarInher car = new CarInher();
        BicycleInher bike = new BicycleInher();
        
        car.gear();
        car.go();
        car.stop();
        System.out.println(car.wheels);
        System.out.println();
        
        bike.peddle();
        bike.go();
        bike.stop();
        System.out.println(bike.wheels);
    }
}
