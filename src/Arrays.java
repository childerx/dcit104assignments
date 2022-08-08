// A program to calculate for thew sum of elements in a given array   by;(Abu Nana Kwame Isaac- 10974843)

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 3, 7};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // An iteration from zero index if the array to -1 the length of the index of the array
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
