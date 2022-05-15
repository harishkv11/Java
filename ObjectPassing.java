public class ObjectPassing {
    public static void main(String args[]){
        GarageOP garage = new GarageOP();
        CarOP car1 = new CarOP("BMW");
        CarOP car2 = new CarOP("Mercedes");
        
        garage.park(car1);
        garage.park(car2);
    }
}
