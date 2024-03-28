package ForLoop;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the N number: ");
        int n = input.nextInt();

        int sum =0;
        for (int num=1; num<=n; num++){
            sum = sum+ num;
        }
        System.out.println("Sum of number: "+ sum);
    }
}
