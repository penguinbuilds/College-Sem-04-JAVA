// annual exam - 10 students
import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Initialize arrays to store student and subject information
        String[] studentNames = new String[numStudents];
        int[] studentRollNumbers = new int[numStudents];
        int[][] marks = new int[numStudents][numSubjects];
        
        // Get student and subject information
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            System.out.print("Name: ");
            studentNames[i] = scanner.next();
            System.out.print("Roll Number: ");
            studentRollNumbers[i] = scanner.nextInt();
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Marks obtained in subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
        }
        
        // Calculate total marks obtained by each student and find student with highest total marks
        int highestTotalMarks = Integer.MIN_VALUE;
        String studentWithHighestTotalMarks = "";
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = 0;
            for (int j = 0; j < numSubjects; j++) {
                totalMarks += marks[i][j];
            }
            if (totalMarks > highestTotalMarks) {
                highestTotalMarks = totalMarks;
                studentWithHighestTotalMarks = studentNames[i];
            }
            System.out.println(studentNames[i] + " obtained " + totalMarks + " marks out of " + (numSubjects * 100));
        }
        System.out.println("The student with the highest total marks is " + studentWithHighestTotalMarks + " with " + highestTotalMarks + " marks.");
        
        // Find highest marks in each subject and the student who achieved it
        for (int j = 0; j < numSubjects; j++) {
            int highestMarks = Integer.MIN_VALUE;
            String studentWithHighestMarks = "";
            for (int i = 0; i < numStudents; i++) {
                if (marks[i][j] > highestMarks) {
                    highestMarks = marks[i][j];
                    studentWithHighestMarks = studentNames[i];
                }
            }
            System.out.println("The highest marks in subject " + (j + 1) + " are " + highestMarks + " obtained by " + studentWithHighestMarks + " with roll no " + studentRollNumbers[j] + ".");
        }
        
        scanner.close();
    }
}
