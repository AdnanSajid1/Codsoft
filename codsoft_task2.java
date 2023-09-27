import java.util.Scanner;

public class codsoft_task2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter total Subjects: ");
        int totalsubject = s.nextInt();

        int totalmarks = 0;

        for (int i = 0; i < totalsubject; i++) {
            System.out.println("Enter Marks of Subject :");
            int marks = s.nextInt();
            totalmarks += marks;
        }

        double AveragePercentage = (double) totalmarks / totalsubject;

        String grade;

        if (AveragePercentage >= 90) {
            grade = "A+";
        } else if (AveragePercentage >= 80) {
            grade = "A";
        } else if (AveragePercentage >= 70) {
            grade = "B";
        } else if (AveragePercentage >= 60) {
            grade = "C";
        } else if (AveragePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Your Total Marks are : " + totalmarks);
        System.out.println("Your Average Percentage is : " + AveragePercentage + "%");
        System.out.println("Your Grade is : " + grade);
    }
}
