package Practice;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the you want to get factorial: ");
        int num = input.nextInt();

        int fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact = fact * i;
            System.out.println("Factorial of " + i + " : "+ fact);

        }
    }
}
