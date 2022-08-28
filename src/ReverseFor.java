import java.util.Scanner;

public class ReverseFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int r = 0;
        for (; n > 0; ) {
            r = n % 10;
            n = n / 10;

            System.out.print(r);
        }
    }
}

