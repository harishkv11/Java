public class overload {
    public static void main(String args[]){
        Pizza pizza = new Pizza("thick crust", "tomato", "mozerella");
        System.out.println("Ingredients of your pizza");

        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println();

        Pizza plane = new Pizza("Thin Crust", "Tandori");
        System.out.println("Ingredients of your plane pizze");
        System.out.println(plane.bread);
        System.out.println(plane.sauce);
        
    }
}
