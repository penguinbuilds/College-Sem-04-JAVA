//string reversal
import java.util.*;

class P07
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String A = sc.nextLine();

        int n = A.length();
        char[] S = new char[n];

        for(int i=0; i<n; i++)
        {
            S[n-i-1] = A.charAt(i); 
        }

        System.out.print("Reversed string: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(S[i]);
        }

        System.out.println("");
    }
}