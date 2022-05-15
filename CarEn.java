public class CarEn {
    private
        int year;
        String name;

    public
        void getter(){
            System.out.println("Year of the car is "+year);
            System.out.println("Name of the car is "+name);
        }

        void setter(String name,int year){
            this.name = name;
            this.year = year;
        }
}
