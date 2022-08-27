import java.util.Scanner;

public class SumNat {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the number for sum");

        int n = r.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = i + sum;
            System.out.print("+" + i);
            i++;
        }

        System.out.println(" sum of natural numbers are " + sum);

    }
}