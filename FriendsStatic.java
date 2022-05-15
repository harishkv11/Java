public class FriendsStatic {
    String name;
    static int friends=0;
    FriendsStatic(String name){
        this.name = name;
        friends++;
    }

    static void displayFriends(){
        System.out.println("You have "+friends+" friends");
    }

}
