public class logical {
    public static void main(String args[]){
        int age = 5;
        char gender = 'F';
        
        if(age>=18 && gender=='M') System.out.println("Room No. 1");
        else if(age<18 && gender=='M') System.out.println("Room No. 2");
        else if(gender=='F' || age>=50) System.out.println("Room No. 3");
        else if(!(gender=='M') && (age<10 || age>=20)) 
            System.out.println("Room No. 4");
    }
}
