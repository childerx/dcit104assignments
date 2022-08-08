// A code to sum all prime numbers preceeding a given number; returns an integer     by;(Abu Nana Kwame Isaac- 10974843)

public class sumPrime {
    public static void main(String[] args) {
        SumOfPrime(10);

    }

    static void SumOfPrime(int num) {
    // A function to calculate for the sum of the prime numbers, once detected by the isPrime function
        boolean isPrimeNum = false;
        int sum = 0;

        for (int i = 2; i < num; i++) {
            isPrimeNum = isPrime(i); // An iteration to check for prime numbers within the given range by the isPrime function

            if (isPrimeNum) { // isPrime serving as a boolean to update the sum block below; updates the sum only when true
                sum = sum + i;
            }
        }
        System.out.println(sum);
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
