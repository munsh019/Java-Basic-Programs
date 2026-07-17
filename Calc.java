import java.util.Scanner;
public class Calc{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while (true) {
         System.out.print("Enter first number: ");
       int num1 = sc.nextInt();
       
       System.out.print("Enter second number: ");
       int num2 = sc.nextInt();

       System.out.print("Enter any operator(+,-,*,/,%): ");
       char operator = sc.next().charAt(0);
        
       switch (operator) {
        case '+':
            int add = num1 + num2;
            System.out.println("Sum: " + add);
            break;
        case '-':
            int sub = num1 - num2;
            System.out.println("Subtraction: " + sub);
            break;
        case '*':
            int product = num1 * num2;
            System.out.println("Product: " + product);
            break;
        case '/':
           if (num2 == 0){
            System.out.println("Cannot divide by zero.");
           }   else {
            double division = (double) num1 / num2;
            System.out.printf("Division: %.2f%n",division);
           }
            break;  
            case '%':
                int remainder = num1 % num2;
                System.out.println("Remainder: " + remainder);
                break;
        default:
            System.out.println("Invalid Operator! ");
            break;
       }
       System.out.print("Do you want to continue? (y/n): ");
       char choice = sc.next().charAt(0);
       if (choice == 'n' || choice == 'N'){
        break;
       }
        
       }
       sc.close();
     
    }
}