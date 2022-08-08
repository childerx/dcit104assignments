// A code to check whether, a number is prime; returns a boolean answer  by;(Abu Nana Kwame Isaac- 10974843)

public class PrimeDet {
    public static void main(String[] args) {

        System.out.println(isPrime(23));

    }
    static boolean isPrime(int num) {
        // A function to detect if the element is a prime number or not
        if (num >= 2) {
            for (int i = 2; i < num; i++) {
                if (num * num % i == 0) {
                    return false;
                }
            }return true;
        } return false;
    }
}
