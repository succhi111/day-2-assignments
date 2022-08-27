import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int i;
        int sum = 0;
        for (i = 1; i <= n; i++) {
            sum = i + sum;

        }
        System.out.println("the sum of given natural number is " + sum);
    }
}
