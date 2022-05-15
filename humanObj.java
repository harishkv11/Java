public class humanObj {
    String name;
    int age;
    char gender;

    humanObj(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void copy(humanObj h){
        this.name = h.name;
        this.age = h.age;
        this.gender = h.gender;
    }
}
