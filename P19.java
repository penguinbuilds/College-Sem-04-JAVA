import java.util.Arrays;
import java.util.Scanner;

public class P19{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        // Convert the string to a character array
        char[] chars = str.toCharArray();
        
        // Sort the character array in alphabetical order
        Arrays.sort(chars);
        
        // Convert the sorted character array back to a string
        String sortedStr = new String(chars);
        
        // Print the sorted string
        System.out.println("Sorted string: " + sortedStr);
    }
}
