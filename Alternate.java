import java.util.*;

public class Alternate {

    // Combine two arrays by alternating their elements
    public static int[] alternate(int[] a, int[] b) {
        int length = a.length;
        int[] result = new int[length * 2];   // final array is twice the size

        for (int i = 0; i < length; i++) {
            result[2 * i] = a[i];             // element from first array
            result[2 * i + 1] = b[i];         // element from second array
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the arrays:");
        int n = sc.nextInt();

        int[] arr1 = new int[n];              // first array
        int[] arr2 = new int[n];              // second array

        System.out.println("Enter elements for first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements for second array:");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = alternate(arr1, arr2); // combine the arrays

        System.out.println("Alternating merged array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
