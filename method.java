public class method {
    public static void main(String args[]){
        sayHi();
        
        int a=4;
        int b=5;
        
        int result=add(a,b);
        System.out.println(result);
    }
    static void sayHi(){
        System.out.println("Hi");
    }
    static int add(int a,int b){
        return a+b;
    }
}
