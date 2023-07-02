// Input from User
import java.util.Scanner;

class P02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
		int a = sc.nextInt();
		System.out.print("Enter float value: ");
		float b = sc.nextFloat();

        System.out.println("The integer value entered is: " + a);
        System.out.println("The float value entered is: " + b);


    }
}