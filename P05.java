// Largest Number
import java.util.*;

class P05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        for(int i=0; i<10; i++)
        {
            System.out.print("Enter element no. " + (i+1) + ": ");
            A[i] = sc.nextInt();
        }

        int l=A[0];
        for(int j=1; j<10; j++)
        {
            if(l<A[j])
            {
                l = A[j];
            }
        }

        System.out.println("The largest number is: " + l);
    }
}