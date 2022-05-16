import java.io.FileWriter;

public class Filewriter {
    public static void main(String args[]){
        try{
            FileWriter writer = new FileWriter("random.txt");
            writer.write("Roses are red\n");
            writer.write("Violets are blue\n");
            writer.write("I don\'t sleep at night.\n");
            writer.write("Cause I\'m thinking of you.\n");
            writer.append("\t~Beautiful song");
            writer.close();
        }   
        catch(Exception e){
            System.out.println("Something went wrong");
        }     
    }    
}
