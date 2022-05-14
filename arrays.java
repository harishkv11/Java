public class arrays {
    public static void main(String args[]){
        String[] names = new String[3];
        names[0]="Harish";
        names[1]="Shivam";
        names[2]="Divyam";

        System.out.println(names[1]);

        for(int i=0;i<names.length;i++){
            System.out.println("Hello "+names[i]);
        }
    }
}
