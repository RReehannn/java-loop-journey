package Pattern.Stars;

import java.util.Scanner;

class TriangularLeft {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter rows: ");
        int r = input.nextInt();

        for (int i = 1; i<= r; i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
        //row: 4
        //*
       //**
       //***
       //****
