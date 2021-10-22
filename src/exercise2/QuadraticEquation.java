package exercise2;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       float a = input.nextFloat();
       float b = input.nextFloat();
       float c = input.nextFloat();

       double D = (b * b ) - (4.0 * a * c);
       double x1;
       double x2;
       float x; 

       if(a != 0){
         if(D >= 0){
           x1 = ((b * -1) + Math.sqrt(D)) / (2*a);
           x2 = ((b * -1) - Math.sqrt(D)) / (2*a);
           System.out.println(x1 + ", " + x2);
           
         } else {
           System.out.println("Imaginary values");
         }

         } else {
           if(b != 0) {
             x = (0 - c) / b;
             System.out.println(x);

           }else {
             if (c != 0){
               System.out.println("No values");
              
             } else {
               System.out.println("Many values");
             }
           }
         }
       }

        

        
        
    }