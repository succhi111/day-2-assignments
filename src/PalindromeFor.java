import java.util.Scanner;
 public class PalindromeFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        int b = a;
        int remainder = 0;
        int reverse = 0;
        for (; b != 0; ) {
            remainder = b % 10;
            reverse = reverse * 10 + remainder;
            b = b / 10;
        }
        if (a == reverse)
            System.out.println("Entered number is a palindrome.");
        else

            System.out.println("Entered number is not a palindrome.");

    }
}
