// s = ut + 1/2at^2
import java.util.Scanner;

class P03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial velocity(m/s): ");
        double u = sc.nextDouble();
        System.out.print("Enter the acceleration(m/s^2): ");
        double a = sc.nextDouble();
        System.out.print("Enter the start time(in second): ");
        double t1 = sc.nextDouble();
        System.out.print("Enter the end time(in second): ");
        double t2 = sc.nextDouble();

        for(double t=t1; t<=t2; t++)
        {
            double s = u*t+(0.5*a*t*t);
            System.out.println("The distance travlled at t=" + t + "s is: " + s + "m.");
        }
    }
}