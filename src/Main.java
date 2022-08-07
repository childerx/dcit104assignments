// A code to select a female first class student in the university for a scholarship

public class Main {
    public static void main(String[] args) {
        SelectGirl((float) 3.7, "female");
        
    }
    
     static void SelectGirl(float gpa, String gender) {
        if (gpa >= 3.6) {
            if (gender == "female") {
                System.out.println("You qualify for this selection");
            } else {
                System.out.println("You don't qualify for this selection");
            }
        } else {
            System.out.println("You don't qualify for this selection");
        }
    }
}
