package Pattern.Stars;

import java.util.Scanner;

public class TriangularRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter rows: ");
        int r = input.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r+1-i); j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
        // row: 5
        //*****
        //****
       //***
       //**
       //*

// for (int i = r; i >= 1; i--) {
//       for (int j = 1; j <= i); j++)
