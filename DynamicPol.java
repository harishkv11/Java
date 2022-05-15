import java.util.Scanner;

public class DynamicPol {
    public static void main(String args[]){
        AnimalDP animal;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal do you want?");
        System.out.println("1-->Dog    2-->Cat");
        System.out.print("Choice : ");
        int choice = scanner.nextInt();

        if(choice==1){
            animal = new DogDP();
            animal.speak();
        }
        else{
            animal = new CatDP();
            animal.speak();
        }

        scanner.close();
    }
}
