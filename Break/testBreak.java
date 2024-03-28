package Break;

import java.util.Scanner;

//Print the first multiple of 5 which is also a multiple of 7;
public class testBreak {
    public static void main(String[] args) {

        int num = 1;

        while (true){
            if ((num % 5 ==0) && (num %7 ==0)){
                System.out.println("Found answer: " + num);
                break;
            }
            num++;

        }
        // Output: 35

    }
}
