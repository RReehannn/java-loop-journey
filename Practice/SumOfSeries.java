package Practice;

import java.util.Scanner;

//Find Sum of Series
// S = 1-2+3-4+-5....n
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the no. of series you wants to calculate: ");
        int num = input.nextInt();


        int ans=0;

        for (int i = 1; i <= num ; i++) {
            if (i % 2 == 0){
                ans = ans - i;

            } else {
                ans = ans + i;
            }

        }
        System.out.println(ans);

    }

}
