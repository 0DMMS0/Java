package Java;

import java.util.Scanner;


public class Expressions {

    public static void main(String[] args){    
        Scanner scanner = new Scanner(System.in);
        //An Expressions is the use of operands and operator
        //Operands: variables, numbers, cuantity
        // Operator: +, - , /, *

        int FirstNumber = 5;
        int SecondNumber = FirstNumber*5;
        System.out.println("The total is: "+SecondNumber);

        System.out.println("Add a number from 1 to 10");
        int SelectedNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Select the second number from 1 to 10");
        int SelectedNumber2 = scanner.nextInt();
        scanner.nextLine();
        int result = SelectedNumber % SelectedNumber2;
        System.out.println("Your reminder is: "+result);

        scanner.close();
    }
}