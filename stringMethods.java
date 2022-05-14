public class stringMethods {
    public static void main(String args[]){
        String name = "Harish";
        
        if(name.equals("Harish")) System.out.println("Name is Harish");
        if(name.equalsIgnoreCase("harish")){
            System.out.println("Name is indeed Harish");
        }

        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('H'));

        String lastName = "";
        if(lastName.isEmpty()) System.out.println("Last Name is not present");
        
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);

        String vague = "        Hi         ";
        System.out.println(vague.trim()); //Remove the spaces

        String result = name.replace('H', 'G');
        System.out.println(result);
    }    
}
