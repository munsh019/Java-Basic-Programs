import java.util.Scanner;

public class FactorialCalculator {
    public static long fact(int num) {
        if (num < 0) {
        throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial: ");
        int num = sc.nextInt();

        try{
            long factorial = fact(num);
            System.out.println("Factorial of " + num +" is " + factorial);
        } catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
    }
        sc.close();
}
}