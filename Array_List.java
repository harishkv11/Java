import java.util.ArrayList;

public class Array_List {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Harish");
        names.add("Harsh");                   
        names.add("Rahul");                   
        
        names.set(0, "Prashant");
        names.remove(1);
        for(int i=0;i<names.size();i++){ //use .size to get the size of ArrayList
            System.out.println(names.get(i)); //to get element at that index
        }

        names.clear();
        System.out.println(names.size());
        
    }
}
