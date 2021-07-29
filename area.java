package Equation_Solving;
//Printing the area of a triangle

import java.util.Scanner;

import java.util.*;

public class area {
    public static void main(String[] args){
        double base,area,height;
        System.out.println("Enter Base: ");
        Scanner scan = new Scanner(System.in);
        base =scan.nextDouble();

        System.out.println("Enter height");
        Scanner scany=new Scanner(System.in);
         height = scany.nextDouble();

        area= (0.5)*(base*height);
        System.out.println("Area is "+area);
    }
}
