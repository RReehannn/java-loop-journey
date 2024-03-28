package Practice;

import java.util.Scanner;

class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the Digits");
         int num = input.nextInt();

         int answer = 0;
         while (num>0){
             answer = (answer*10) + (num%10);
             num = num /10;

         }
        System.out.println(answer);
    }
}
