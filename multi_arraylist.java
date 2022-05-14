import java.util.ArrayList;

public class multi_arraylist {
    public static void main(String args[]){
        ArrayList<ArrayList<String>> names = new ArrayList<ArrayList<String>>();
        
        ArrayList<String> DPS = new ArrayList<String>();
        DPS.add("Harish");
        DPS.add("Daksh");
        DPS.add("Rahul");

        ArrayList<String> RYAN = new ArrayList<String>();
        RYAN.add("Vivan");
        RYAN.add("Aditya");
        RYAN.add("Harsh");
        
        ArrayList<String> ASTER = new ArrayList<String>();
        ASTER.add("Himanshu");
        ASTER.add("Ashu");
        ASTER.add("Shivam");
        
        names.add(DPS);
        names.add(RYAN);
        names.add(ASTER);

        System.out.println(names);
        System.out.println(names.get(1).get(2));
    }
}
