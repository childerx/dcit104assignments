// A program to calculate for Population Standard Deviation

public class Main {
    public static void main(String[] args) {

        int[] arr = {};
        PopStanDev(arr);
        SampleStanDev(arr);

    }
    // Population Standard Deviation
    static void PopStanDev(int[] arr) {
        float sum = 0;
        float count = 0; //this will hold the number of elements in the array

        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
            count++;
        }
        float average = (sum / count); // calculates the average for the array
        System.out.print("The Mean is " + average);

        float sumNum = 0; // represents the numerator of the standard deviation formulae
        for (int i = 0; i < arr.length; i++) {
            float numb = (arr[i] - (average));
            float number = (numb * numb); // calculates the square of (Xi-Mean)
            sumNum =  (sumNum + number);
        }

        float ans = (float) (Math.sqrt((sumNum / count)));
        System.out.printf(", and the population standard deviation is %.2f", ans);

    }
// Sample Standard Deviation
    static void SampleStanDev(int[] arr) {
        float sum = 0;
        float count = 0; //this will hold the number of elements in the array

        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
            count++;
        }
        float average = (sum / count); // calculates the average for the array
        System.out.print("The Mean is " + average);

        float sumNum = 0; // represents the numerator of the standard deviation formulae
        for (int i = 0; i < arr.length; i++) {
            float numb = (arr[i] - (average));
            float number = (numb * numb); // calculates the square of (Xi-Mean)
            sumNum =  (sumNum + number);
        }

        float ans = (float) (Math.sqrt((sumNum / (count - 1))));
        System.out.printf(", and the sample standard deviation is %.2f", ans);
    }
}
