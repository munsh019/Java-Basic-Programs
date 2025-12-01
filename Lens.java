import java.util.*;

public class Lens {

    // Function that takes an array of strings and returns an array of their lengths
    public static int[] lens(String[] arr){
        int[] lengths = new int[arr.length];  // Create array to store lengths

        // Loop through each string and calculate its length
        for(int i = 0; i < arr.length; i++){
            lengths[i] = arr[i].length();
        }

        return lengths;  // Return the array of lengths
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Ask user how many strings they want to enter
        System.out.println("Enter how many strings? ");
        int n = sc.nextInt();
        sc.nextLine();  // Clear leftover newline

        String[] arr = new String[n];  // Create array to store user input strings

        // Read strings from the user
        for (int i = 0; i < n; i++){
            System.out.println("Enter String " + (i + 1) + ": ");
            arr[i] = sc.nextLine(); // Store each string in the array
        }

        // Call the lens function to get the lengths
        int[] result = lens(arr);

        // Display the lengths of each string
        System.out.println("Lengths: " + Arrays.toString(result));
    }
}
