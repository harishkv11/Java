import java.util.Scanner;
public class user_input {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        System.out.println("You are "+age+" years old");

        scanner.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = scanner.nextLine();
        System.out.println("Your last name is "+lastName);
    }
}
