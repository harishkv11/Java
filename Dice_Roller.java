import java.util.Random;

public class Dice_Roller{
    //Local Variable Implementation
    Dice_Roller(){
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }
    void roll(Random random, int number){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

    //Global Implementation
    Random rand;
    int year;
    void getYear(){
        yearMade();
    }
    void yearMade(){
        year = rand.nextInt(2022)+1;
        System.out.println(year);
    }
}