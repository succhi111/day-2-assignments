import java.util.Scanner;

public class NumberWord {
    static void display(int num) {

        if (num == 1)
            System.out.println("one");
        else if (num == 2)
            System.out.println("two");
        else if (num == 3)
            System.out.println("three");
        else if (num == 4)
            System.out.println("four");
        else if (num == 5)
            System.out.println("five");
        else if (num == 6)
            System.out.println("six");
        else if (num == 7)
            System.out.println("seven");
        else if (num == 8)
            System.out.println("eight");
        else if (num == 9)
            System.out.println("mine");
        else if (num == 0)
            System.out.println("zero");
        else
            System.out.println("please enter single digit from 0to 9");
    }


    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter any number to print word");
        int num = r.nextInt();
        display(num);
    }
}