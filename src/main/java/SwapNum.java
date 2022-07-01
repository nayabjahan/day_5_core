import java.util.Scanner;

public class SwapNum {
    public static void main(String []args)
    {
        //Take input from the user
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        System.out.println("Before Swapping numbers are: ");
        System.out.println("The first Number is "+num1);
        System.out.println("The second Number is "+num2);

         //Use a temporary variable to swap the numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping numbers are: ");
        System.out.println("The first Number is "+num1);
        System.out.println("The second Number is "+num2);
    }
}
