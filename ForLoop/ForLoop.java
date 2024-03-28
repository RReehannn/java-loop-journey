package ForLoop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter N number: ");
        int n = scanner.nextInt();

        for (int num=1; num<= n; num++){
            System.out.println(num);
        }

    }
}
