import java.util.ArrayList;

public class For_each {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Harish");
        names.add("Rahul");
        names.add("Harsh");
        names.add("Prashant");
        
        for(String x: names) System.out.println(x);
    }
}
