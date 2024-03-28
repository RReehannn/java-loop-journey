package Continue;

import java.util.Scanner;

// Continue keyword stop current iteration and flow goes to the next iteration.
public class Continue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = input.nextInt();

        for (int i = 1; i<= num; i++){
            if (i == 5){
                continue;
            }
            System.out.print(i + " ");

        }
        //Output: 1 2 3 4 6 7 8 9 10 11 12 13 14 15
        // 5 is not seen in output due to continue keyword

    }
}
