// divisor program with interface
interface AdvancedArithmetic {
    int sumOfDivisors(int num);
}

class MyCalculator implements AdvancedArithmetic {
    public int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class P14 {
    public static void main(String[] args) {
        MyCalculator obj = new MyCalculator();
        int num = 10;
        int sum = obj.sumOfDivisors(num);
        System.out.println("Sum of divisors of " + num + " is " + sum);
    }
}
