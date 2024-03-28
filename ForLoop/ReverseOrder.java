package ForLoop;

import java.util.Scanner;

public class ReverseOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the number: ");
        int n = input.nextInt();

        for (int num = n; num>=1; num--){
            System.out.println(num);
        }
    }
    // In for loop all condition also be optional

}
