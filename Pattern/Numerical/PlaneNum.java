package Pattern.Numerical;

import java.util.Scanner;

class PlaneNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter rows: ");
        int r = input.nextInt();
        System.out.print("Please Enter column: ");
        int c = input.nextInt();

        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(j);

            }
            System.out.println();

        }


    }
}
