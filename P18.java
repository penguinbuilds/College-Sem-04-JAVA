import java.util.Scanner;

public class P18 {

    public static String delete(String str, int n) {
        if (str == null || str.isEmpty() || n < 0 || n >= str.length()) {
            return str;
        }
        return str.substring(0, n) + str.substring(n+1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter the index of the character to remove: ");
        int index = sc.nextInt();
        String result = delete(str, index);
        System.out.println("The string with the character removed is: " + result);
    }

}
