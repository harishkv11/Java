public class MethodOverriding {
    public static void main(String args[]){
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        dog.general();
        cat.general();
        System.out.println();
        
        //Overriden methods
        cat.sound(); 
        dog.sound();

    }
}
