import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        num1 = Math.round(num1 * 1000.0) / 1000.0;
        num2 = Math.round(num2 * 1000.0) / 1000.0;
        
        if (num1 == num2) {
            System.out.println("The numbers are equal up to three decimal places.");
        } else {
            if (num1 > num2) {
                System.out.println(num1 + " is greater than " + num2 + ".");
            } else {
                System.out.println(num2 + " is greater than " + num1 + ".");
            }
        }
    }
}
