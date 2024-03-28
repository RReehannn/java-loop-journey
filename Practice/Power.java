package Practice;

import java.util.Scanner;

// Given 2 numbers a and b. Find a raise to the power b.
public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter first number: ");
        int first = input.nextInt();
        System.out.print("Please Enter second Number: ");
        int second = input.nextInt();

        int ans = 1;

        for (int i = 1; i <= second ; i++) {
            ans = ans * first;
            System.out.println(ans);
        }


    }
}
