import java.util.Random;

public class random_numbers {
    public static void main(String args[]){
        Random random = new Random();
        for(int i=0;i<5;i++){
            int z=random.nextInt(10); //bound --> max value z can take excluded
            System.out.println(z);
        }     
        System.out.println();
        //To give random numbers from 1 to bound(included)
        for(int i=0;i<5;i++){
            int z = random.nextInt(6)+1;
            System.out.println(z);
        }
    }
}
