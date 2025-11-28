import java.util.Scanner;

public class MulWord {
    // Method to repeat a word n times with spaces
    public static String mulWord(String s, int n) {
        if (n <= 0) {
            return ""; // Return empty string if n <= 0
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(s);
            if (i < n - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String s = sc.nextLine();

        System.out.print("Enter how many times to repeat: ");
        int n = sc.nextInt();

        String result = mulWord(s, n);
        System.out.println("Result: " + result);
    }
}
