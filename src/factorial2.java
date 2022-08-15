
public class factorial2 {
    public static void main(String[] args) {
       Factorial(6);

    }
    static void Factorial(int num) {
        System.out.print("The factorial of " + num + " is ");

        for (int i = (num - 1); i >= 1; i--) {
            num = num * i;
        }
        System.out.println(num);
    }
}
