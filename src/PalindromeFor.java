import java.util.Scanner;
 public class PalindromeFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        int c=n;
        int r=0;
        int s=0;
        for (; n>0; ) {
            r = n% 10;
            s = s * 10 + r;
            n = n / 10;
        }
        if (c==s)
            System.out.println("Entered number is a palindrome.");
        else

            System.out.println("Entered number is not a palindrome.");

    }
}
