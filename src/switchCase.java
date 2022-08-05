// A code using switching cases to print out corresponding complements for various grades

public class switchCase {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("very good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
            default:
                System.out.println("Failed");
                break;
        }
    }
}
