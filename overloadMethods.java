public class overloadMethods {
   public static void main(String args[]){
        int a=1,b=2,c=3;
        add();
        System.out.println(add(a,b));
        System.out.println(add(a,b,c)); 
   }
   static void add(){
       System.out.println("This just prints add");
   } 
   static int add(int a,int b){
       System.out.println("This prints addition of two integers");
       return a+b;
   }
   static int add(int a,int b,int c){
       System.out.println("This prints addition of three integers");
       return a+b+c;
   }
}
