package Equation_Solving;

import java.util.*;

public class cuboid {

    public static void main(String[] args){
        int length,height,width;
        System.out.println("Enter Length,Height,Width: ");
        Scanner l=new Scanner(System.in);
        length=l.nextInt();

        Scanner h=new Scanner(System.in);
        height=h.nextInt();
        
        Scanner w=new Scanner(System.in);
        width=w.nextInt();

       int  volume=length*height*width;
       System.out.println("Volume : "+volume);

       //For Calculating the area of a cuboid
       
       // font/back= length x height
       //right/left = width x height
       //bottom/top =length x width

       int font= length*height;
       int right= width*height;
       int bottom= length*width;

       int area= ((2*length)+(2*height)+(2*width));
       System.out.println("Area is "+area);

    }
}
