public class nested {
    public static void main(String args[]){
        //Program to print a right angle triangle

        int row = 5;
        int col = 5;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j<=i) System.out.print("#");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
