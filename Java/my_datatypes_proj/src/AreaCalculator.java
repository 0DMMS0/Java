import java.util.Scanner;

public class AreaCalculator {

    //add the methods to calculate area here
    private static double square(int a){
        return a * a;
    }

        private static double rectangle(int a, int b){
        return a * b;
    }


    private static float pi = 3.142f;
    private static double circle(int r){
        return (pi * r  * r);
    }

    private static void main(String[] args){
        System.out.println("==Welcome to the area calculator==");
        while(true){
            //Add the menu to get user input and invoke method here
            System.out.println("\nEnter 1 for circle\n" +
            "Enter 2 for square\n" +
            "Enter 3 for rectangle");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                System.out.println("Enter the radius of the circle");
                float radius = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of circle of radius "+ radius + "is " + circle(radius));
            } else if (choice == 2) {
                System.out.println("Enter the length of the square");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of square of side length "+ length + " is " + square(length));
            } else if (choice == 3) {
                System.out.println("Enter the length of the rectangle");
                float length = Float.parseFloat(scanner.nextLine());
                System.out.println("Enter the breadth of the rectangle");
                float breadth = Float.parseFloat(scanner.nextLine());
                System.out.println("The area of rectangle of length "+ length +
                                    "and breadth "+breadth+ " is " + rectangle(length,breadth));
            } else {
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}