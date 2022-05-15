import java.util.Random;

public class Interface {
    public static void main(String args[]){
        rabbitInter rabbit = new rabbitInter();
        HawkInter hawk = new HawkInter();
        FishInter fish = new FishInter();

        rabbit.flee();     
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
