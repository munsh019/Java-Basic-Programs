import java.util.Scanner;

public class Reverse {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();

        String reversed = reverse(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
