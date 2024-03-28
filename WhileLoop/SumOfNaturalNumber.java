package WhileLoop;

import java.util.Scanner;

//Sum of N natural Number
class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the N Natural number: ");
        int n = input.nextInt();

        int sum = 0; //Initialize
        int num = 1;

        while (num <= n){ //Condition
            sum = sum + num;
            num++; //Updation
        }
        System.out.println(sum);

    }
}
