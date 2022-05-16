import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class audio {
    public static void main(String args[]){
        try{
            File file = new File("sample.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            
            Scanner scanner = new Scanner(System.in);
            String response = "";
            while(!response.equals("Q")){
                System.out.println("P->Play S->Stop R->Reset Q->Quit");
                System.out.print("Enter your choice : ");

                response = scanner.nextLine();
                response = response.toUpperCase();

                if(response.equals("S")){
                    clip.stop();
                }
                else if(response.equals("Q")){
                    clip.close();
                }
                else if(response.equals("R")){
                    clip.setMicrosecondPosition(0);
                }
                else clip.start();
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }
}
