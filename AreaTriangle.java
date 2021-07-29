package Equation_Solving;
import java.util.Scanner;


public class AreaTriangle {
        public static void main(String[] args){
            double a,b,c,s,area;
            System.out.println("Enter A: ");
            Scanner ab=new Scanner(System.in);
            a=ab.nextDouble();

            System.out.println("Enter B: ");
            Scanner bc=new Scanner(System.in);
            b=bc.nextDouble();

            System.out.println("Enter C: ");
            Scanner cd=new Scanner(System.in);
            c=cd.nextDouble();

            //perimeter
            s=0.5*(a+b+c);
            System.out.println(" S is "+ s);
            
            area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area is "+ area);

        }
}
