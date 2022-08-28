import java.util.Scanner;

public class MonthCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of month you want to know: ");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println(c + " is January.");
                break;
            case 2:
                System.out.println(c + " is February.");
                break;
            case 3:
                System.out.println(c + " is March.");
                break;
            case 4:
                System.out.println(c + " is April.");
                break;
            case 5:
                System.out.println(c + " is May.");
                break;
            case 6:
                System.out.println(c + " is June.");
                break;
            case 7:
                System.out.println(c + " is July.");
                break;
            case 8:
                System.out.println(c + " is August.");
                break;
            case 9:
                System.out.println(c + " is September.");
                break;
            case 10:
                System.out.println(c + " is October.");
                break;
            case 11:
                System.out.println(c+" is November.");
                break;
            case 12:
                System.out.println(c+" is December.");
                break;
            default:
                System.out.println(c + " Enter number between 1 to 12.");
                break;
        }
        System.out.println("Hope you got your answer. Thank you!!");
    }
}