package LOOOP;
// Print the sum of stream of integer in the input.

import java.util.Scanner;

public class streamOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number: ");
        int num = input.nextInt();

        int sum=0;

        while (num != -1){
            sum += num;
            num= input.nextInt();

        }
        System.out.println(sum);

    }
}
