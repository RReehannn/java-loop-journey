package WhileLoop;

import java.util.Scanner;

// print 1 to n
class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number: ");
        int n = input.nextInt();

        int num = 1;
        while (num <= n){
            System.out.println(num);
            num++; //increment operator ++, num = num + 1;

        }

    }
}
