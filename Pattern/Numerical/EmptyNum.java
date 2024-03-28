package Pattern.Numerical;

import java.util.Scanner;

class EmptyNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter rows: ");
        int r = input.nextInt();
        System.out.print("Please Enter columns: ");
        int c = input.nextInt();

        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i ==r || j ==1 || j ==c){
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
//Please Enter row: 5
//Please Enter column: 5
        // 12345
        // 1   5
        // 1   5
       //  1   5
       //  12345
