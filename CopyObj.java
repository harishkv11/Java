public class CopyObj {
    public static void main(String args[]){
        humanObj h1 = new humanObj("Harish",22,'M');
        humanObj h2 = new humanObj("XYZ",54,'F');
        
        h2.copy(h1);
        System.out.println(h2.name);
        System.out.println(h2.age);
        System.out.println(h2.gender);
    }
}
