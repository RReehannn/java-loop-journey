package Continue;
// Print all the value between 1 and 50 except for the multiples of 3.
// With for loop
public class TestContinue {
    public static void main(String[] args) {
        for (int i = 1; i <=50 ; i++) {
            if (i % 3 == 0){
                continue;
            }
            System.out.print(i + " ");

        }
        // Output: 1 2 4 5 7 8 10 11 13 14 16 17 19 20 22 23 25 26 28 29 31 32 34 35 37 38 40 41 43 44 46 47 49 50
        // here all multiple of 3 is not seen due to continue condition.
    }

}
