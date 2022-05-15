public class Static {
    public static void main(String args[]){
        FriendsStatic friend1 = new FriendsStatic("Harish");
        FriendsStatic friend2 = new FriendsStatic("Rahul");        
        FriendsStatic friend3 = new FriendsStatic("Harsh");        

        System.out.println(FriendsStatic.friends);
        FriendsStatic.displayFriends();
    }
}
