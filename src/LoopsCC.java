// Using loops to print series of even numbers between 0 and 40

public class LoopsCC {
    public static void main(String[] args) {

        // For Loop
        for (int i = 2; i < 40; i = i + 2) { // iterating through the even numbers between the given range
            System.out.print(i + " ");
        }

        // While Loop
        int k = 0;
        while (k <= 10) {
            System.out.println("Just started Programming..");
            k++;
        }

        // Do-While Loop
        int n = 1;
        do {
            System.out.println("First Programming Language..");
            n++;
        } while (n > 2);
    }
}
