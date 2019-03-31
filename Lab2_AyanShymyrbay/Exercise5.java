//Exercise 5. Quadratic Equation
import java.util.Scanner;
import java.lang.*;

public class Exercise5 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        double D;
        double x1,x2;
        double ReX,ImX;

        System.out.print("Quadratic coefficients: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        D = Math.pow(b,2) - 4*a*c;
        System.out.print("Discrimintant: "+D+"\n");
        if(D>0){
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.print("Roots: "+x1+" , "+x2);
        }
        else if(D==0){
            System.out.print("Only One Root!\n");
            x1= -b/(2*a);
            System.out.print("Root: "+x1);
        }
        else{
            System.out.print("It has Complex Roots!\n");
            D = -D;
            ReX = -b/(2*a);
            ImX = Math.sqrt(D)/(2*a);
            System.out.print("Roots: "+ReX+" + "+ImX+"i , " + ReX +" - "+ImX+ "i");
        }


    }
}
