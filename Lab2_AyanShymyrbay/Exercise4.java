//Exercise 4. Two Pyramids Up and Down
import java.util.Scanner;

public class Exercise4 {
    public static void main( String[] args){
        //Creating a Scanner object
    	Scanner input = new Scanner(System.in);
        int n;
        int total;
        int countHash;
        int countAst=1;

        System.out.print("Enter a number of rows: ");
        n = input.nextInt();
        System.out.print("Enter two characters to fill in the triangles: ");
        String s = input.next();
        char[] ch=s.toCharArray();
        
        total=2*n;
        for(int row = 1;row <=n; row++) {
            countHash=total - countAst;
            for(int i = 1; i <= countHash; i++){
                System.out.print(ch[0]);
            }
            System.out.print(" ");
            for(int ast=1; ast<=countAst;ast++){
                System.out.print(ch[1]);
            }
            System.out.println();
            for(int space=0; space < row; space++){
                System.out.print(" ");
         }
            countAst +=2;

       }
    }
}
