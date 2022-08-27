import java.util.Scanner;

public class NumPlace {
    public static void main(String[] args) {
        System.out.println("enter any number to get the place value");
        Scanner r = new Scanner(System.in);
        int num = r.nextInt();

        if (num < 10)
            System.out.println("Unit");

        else if (num < 100)
            System.out.println("tenth");

        else if (num < 1000)
            System.out.println("Hundred");


        else if (num < 10000)
            System.out.println("Thousand");

        else
            System.out.println("plese enter valid number");

    }
}
    

