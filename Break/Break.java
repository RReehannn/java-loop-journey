package Break;
//Break keyword terminate the loop.
import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number:- ");
        int nums = input.nextInt();

        for (int num= 1; num <=nums; num++){
            if (num==15){
                break; //Were the break keyword has Seen Loop would Stop.
            }
            System.out.print(num+ " ");
        }
        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14
        // Break keyword not give freedom to go ahead beyond 14
    }
}
