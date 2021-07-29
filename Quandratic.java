package Equation_Solving;
// Solving quandratic equation
import java.util.*;

public class Quandratic {
    
    public static void main(String[] args){
        int a,b,c;
        double r1,r2;

        System.out.println("Enter A,B,C: ");
        Scanner ab = new Scanner(System.in);
        a=ab.nextInt();
        Scanner bc = new Scanner(System.in);
        b=bc.nextInt();
        Scanner cd = new Scanner(System.in);
        c=cd.nextInt();

        r1= ((-b) + Math.sqrt( (b*b)-(4*a*c))) / (2*a);
        System.out.println("The value of R1  " +r1);

        r2= ((-b) - Math.sqrt( (b*b)-(4*a*c))) / (2*a);
        System.out.println("The value of  R2  "+r2);
    }
}
