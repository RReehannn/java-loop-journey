package Pattern.Stars;

class TestNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("Md " + i);
            for (int j =1; j<= 3; j++){
                System.out.println("Rehan " + j);
            }

        }
    }
}
//Output:
// Md 1
//Rehan 1
//Rehan 2
//Rehan 3
//Md 2
//Rehan 1
//Rehan 2
//Rehan 3
//Md 3
//Rehan 1
//Rehan 2
//Rehan 3


