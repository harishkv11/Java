public class Super {
    public static void main(String args[]){
        HeroSuper hero1 = new HeroSuper("Batman",32,"Rich");
        HeroSuper hero2 = new HeroSuper("Iron man",36,"Jarvis");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println();

        System.out.println(hero2.name);
        System.out.println(hero2.age);
        System.out.println(hero2.power);
        
    }
}
