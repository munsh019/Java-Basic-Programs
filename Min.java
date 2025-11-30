import java.util.Scanner;

public class Min {
    public static int min(int[] arr){
        int minValue = arr[0];
        for (int i =1; i < arr.length;i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " Integers: ");

        for (int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum Value: " + min(arr));
        sc.close();
    }
}