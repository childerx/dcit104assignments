// A code to calculate for the Average of even numbers between 1 and 1000;    by;(Abu Nana Kwame Isaac- 10974843)

public class EvenAverage {
    public static void main(String[] args) {
        AverageOfEven(1000);

    }
    static void AverageOfEven(int num) {
        int sum = 0; // this is the sum of the even numbers between the range
        int c = 0; // this will serve as the counter of the even numbers
        float average = 0;

        for (int i = 2; i < num; i += 2) {
            sum = sum + i;
            c++;
        }
        average = (float) sum / c;
        System.out.println(average);
    }
}
