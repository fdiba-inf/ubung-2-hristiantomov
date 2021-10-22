package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        
        //123

        int number1 = number % 10; // 3
        int number2 = (number / 10) % 10; // 2
        int number3 = ((number / 10) / 10); // 1
        
        int sumOfDigits = number1 + number2 + number3; 

        System.out.println("Sum of digits: " + sumOfDigits);
    }
}