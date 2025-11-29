import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(int num){
        int reversed = 0, temp =num;
        while(temp > 0){
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        return num == reversed;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num + (isPalindrome(num) ? " is a palindrome." : " is not a palindrome."));

        sc.close();
    }
}