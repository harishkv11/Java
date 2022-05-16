import java.util.Scanner;

public class exceptionhandling {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x= scanner.nextInt();

        System.out.print("Enter y : ");
        int y = scanner.nextInt();

        try{
            int result = x/y;
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println("Something went wrong....Try again!");
        }
        scanner.close();
    }
}
