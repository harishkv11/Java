import java.io.FileReader;

public class Filereader {
    public static void main(String args[]){
        try{
            FileReader reader = new FileReader("random.txt");
            int d = reader.read();
            while(d!=-1){
                System.out.print((char)d);
                d = reader.read();
            }
            reader.close();
        }   
        catch (Exception e){
            System.out.println("Something went wrong!");
        }     
    }
}
