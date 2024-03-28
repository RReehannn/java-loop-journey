package Pattern.Stars;

import java.util.Scanner;

class Rectangular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter row: ");
        int r = input.nextInt();
        System.out.print("Please Enter column: ");
        int c = input.nextInt();

        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
            // Rows 3 and column 6
            // ******
            // ******
           // ******
