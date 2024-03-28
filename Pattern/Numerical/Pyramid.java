package Pattern.Numerical;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter rows : ");
        int r = input.nextInt();

        for (int i = 1; i <= r; i++) {  //Traversing over rows
            //Print r-i spaces
            for (int j = 1; j < (r-i) ; j++) {
                System.out.print(" ");
            } //Print 1 to i
            for (int k = 1; k <= i ; k++) {
                System.out.print(k);

            }
            // print i -1 to 1
            for (int l = i-1; l >= 1; l--) {
                System.out.print(l);

            }

            System.out.println();
        }
    }
}
// rows : 4
//  1
// 121
//12321
//1234321
