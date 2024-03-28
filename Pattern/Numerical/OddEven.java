package Pattern.Numerical;

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter rows: ");
        int r = input.nextInt();
        System.out.print("Please Enter columns: ");
        int c = input.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=c ; j++) {
                if ((i+j) % 2 == 0){
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }

            }
            System.out.println();

        }

    }
}
// rows: 4
//columns: 4
//1212
//2121
//1212
//2121
