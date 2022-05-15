public class AOO {
    public static void main(String args[]){
        Student[] student = new Student[3];
        
        Student st1 = new Student("Harish", 22, 'M');
        Student st2 = new Student("Harsh", 23, 'M');
        Student st3 = new Student("Sakshi", 19, 'F');

        student[0]=st1;
        student[1]=st2;
        student[2]=st3;
               
        for(int i=0;i<3;i++){
            System.out.println("Information of student #"+(i+1));
            System.out.println(student[i].name);
            System.out.println(student[i].age);
            System.out.println(student[i].gender);
            System.out.println();
        }
    }
}
