import java.util.Scanner;
public class gradeCalculator {
    public static void main(String[] args) {
        System.out.println("This is helpful in finding Grade of the Student");

        int Computer_science_marks, Information_technology_marks, English_marks, Marathi_marks, Biology_marks, maths_marks;
        int Total_marks;
        double average_percentage;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Computer_science marks out of 100: ");
        Computer_science_marks = sc.nextInt();
        System.out.print(" Enter Information_technology marks out of 100: ");
        Information_technology_marks = sc.nextInt();
        System.out.print(" Enter English marks out of 100: ");
        English_marks = sc.nextInt();
        System.out.print(" Enter Marathi marks out of 100: ");
        Marathi_marks = sc.nextInt();
        System.out.print(" Enter Biology marks out of 100: ");
        Biology_marks = sc.nextInt();
        System.out.print(" Enter maths marks out of 100: ");
        maths_marks = sc.nextInt();

        Total_marks = Computer_science_marks + Information_technology_marks + English_marks + Marathi_marks + Biology_marks
                +  maths_marks;
        System.out.println("The total marks is: " + Total_marks);

        average_percentage = Total_marks / 6;
        System.out.println("The average percentage is: " + average_percentage);

        if (average_percentage >= 90) {
            System.out.println(" Grade is A+");
        } else if (average_percentage >= 80) {
            System.out.println(" Grade is A");
        } else if (average_percentage >= 70) {
            System.out.println(" Grade is B");
        } else if (average_percentage >= 60) {
            System.out.println(" Grade is C");
        } else if (average_percentage >= 50) {
            System.out.println(" Grade is D");
        } else if (average_percentage >= 35) {
            System.out.println(" Grade is E");
        } else {
            System.out.println(" You are Fail");
        }
    }
}
    

