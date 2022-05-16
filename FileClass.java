import java.io.File;
public class FileClass {
    public static void main(String args[]){
          File file = new File("random.txt");
          
          //Checking whether file exist or not
          if(file.exists()){
                System.out.println("File exists");
                System.out.println(file.getPath());
                System.out.println(file.getAbsolutePath()); //to get the path of the file
                System.out.println(file.isFile()); //to check whether it is file or not
                file.delete(); //to delete file
          }
          else System.out.println("File doesn't exist");

          
    }
}
