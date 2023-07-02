//matrix multiplication
import java.util.*;

class P06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[10][10];
        int[][] B = new int[10][10];
        int[][] C = new int[10][10];

        System.out.print("Enter the number of rows in first matrix: ");
        int a1 = sc.nextInt();
        System.out.print("Enter the number of columns in first matrix: ");
        int a2 = sc.nextInt();

        System.out.println("Please input elements into the first matrix.");

        for(int i=0; i<a1; i++)
        {
            for(int j=0; j<a2; j++)
            {
                System.out.print("Enter element at position [" + (i+1) + ", " + (j+1) + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nFirst Matrix\n");

        for(int i=0; i<a1; i++)
        {
            for(int j=0; j<a2; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        System.out.print("Enter the number of rows in second matrix: ");
        int b1 = sc.nextInt();
        System.out.print("Enter the number of columns in second matrix: ");
        int b2 = sc.nextInt();

        System.out.println("Please input elements into the second matrix.");

        for(int i=0; i<b1; i++)
        {
            for(int j=0; j<b2; j++)
            {
                System.out.print("Enter element at position [" + (i+1) + ", " + (j+1) + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nSecond Matrix\n");

        for(int i=0; i<b1; i++)
        {
            for(int j=0; j<b2; j++)
            {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        if(a2 != b1)
        {
            System.out.println("Matrix multiplication not possible. Incompatible dimensions.");
        } else {
            System.out.println("\nMatrix obtained by multiplication:\n");

            for(int i=0; i<a1; i++)
            {
                for(int j=0; j<b2; j++)
                {
                    int sum=0;
                    for(int k=0; k<a2; k++)
                    {
                        sum = sum + A[i][k]*B[k][j];                        
                    }
                    C[i][j] = sum;
                }
            }

            for(int i=0; i<a1; i++)
            {
                for(int j=0; j<b2; j++)
                {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println("");
            }
        }

        System.out.println("");
    }
}