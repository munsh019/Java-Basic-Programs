import java.util.Scanner;

public class Remove {
    // Method to remove character at index i
    public static String remove(String s, int i) {
        if (s == null || i < 0 || i >= s.length()) {
            return s; // Return original string if index is invalid
        }
        return s.substring(0, i) + s.substring(i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        System.out.print("Enter the index of the character to remove: ");
        int i = sc.nextInt();

        String result = remove(s, i);
        System.out.println("String after removal: " + result);
    }
}
