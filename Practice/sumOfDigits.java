package Practice;

import java.util.Scanner;

// Find the sum of Digits in a given number n?
class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your Digits: ");
        int num = input.nextInt();

        int sumOfDigits = 0;

        while (num>0) {
            sumOfDigits = sumOfDigits + (num % 10);
            num = num / 10;
        }

            System.out.println("Sum of the Digits is " + sumOfDigits);

        }
    }

