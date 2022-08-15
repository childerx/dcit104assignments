import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number here: ");
       Factorial();

    }
    static void Factorial() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.print("The factorial of " + num + " is ");

        for (int i = (num - 1); i >= 1; i--) {
            num = num * i;
        }
        System.out.println(num);
    }
}
