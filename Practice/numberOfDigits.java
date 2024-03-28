package Practice;

import java.util.Scanner;

// Count the number of digits for a given number n?
class numberOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter your Digits: ");
        int num = input.nextInt();

        int numOfDigits = 0;

        while (num >0){
              num = num/10;
              numOfDigits++;
          }
        System.out.println("No of digits is " + numOfDigits);

    }
}
