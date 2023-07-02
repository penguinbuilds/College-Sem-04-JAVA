// exception handling - array out of bounds
import java.util.*;

class P11
{
        public static void main(String[] args)
        {
            int A[] = { 1, 2, 3, 4, 5 };
            try {
                for (int i = 0; i <= A.length; i++)
                    System.out.print(A[i]+" ");
            }
            catch (Exception e) {
                System.out.println("\nException Caught - Array out of Bounds!");
            }
        }
}