public class polymorphism {
    public static void main(String args[]){
        CarPM car = new CarPM();
        BicyclePM bike = new BicyclePM();
        BoatPM boat = new BoatPM();

        VehiclePM[] racers = {car,bike,boat};

        for(VehiclePM x: racers){
            x.go();
        }
    }
}
