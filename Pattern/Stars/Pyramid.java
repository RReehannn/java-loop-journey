package Pattern.Stars;

import java.util.Scanner;

class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter rows : ");
        int r = input.nextInt();

        for (int i = 1; i <= r; i++) {  //Traversing over rows
            //Print r-i spaces
            for (int j = 1; j < (r-i) ; j++) {
                System.out.print(" ");
            } //Print 2*i -1
            for (int k = 1; k <= (2*i -1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
// rows: 5
//   *
//  ***
// *****
//*******
//*********
