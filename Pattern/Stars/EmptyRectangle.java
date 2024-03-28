package Pattern.Stars;

import java.util.Scanner;

class EmptyRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter row: ");
        int r = input.nextInt();
        System.out.print("Please Enter column: ");
        int c = input.nextInt();

        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i ==r || j ==1 || j ==c){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
// for 4 rows and 4 columns
// ****
// *  *
// *  *
// ****

