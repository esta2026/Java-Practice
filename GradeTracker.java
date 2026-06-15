import java.util.Scanner;

public class GradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students (1-10): ");
        int count = scanner.nextInt();

        int[] scores = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter score for Student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        printReport(scores, count);

        scanner.close();
    }

    // Method for grade
    static char getLetterGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    // Method for average
    static double computeAverage(int total, int count) {
        return (double) total / count; // explicit cast
    }

    // Method to printreport
    static void printReport(int[] scores, int count) {
        int total = 0;
        int highest = scores[0];
        int lowest = scores[0];
        int passing = 0;

        System.out.println("\n============================================");
        System.out.println("          CS 234 — GRADE REPORT");
        System.out.println("============================================");
        System.out.printf("%-12s %-8s %-8s %-8s%n", "Student", "Score", "Grade", "Status");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < count; i++) {
            int score = scores[i];
            char grade = getLetterGrade(score);

            total += score;

            if (score > highest) highest = score;
            if (score < lowest) lowest = score;

            String status = (grade != 'F') ? "Pass" : "FAIL";
            if (grade != 'F') passing++;

            System.out.printf("%-12s %-8d %-8c %-8s%n",
                    "Student " + (i + 1),
                    score,
                    grade,
                    status);
        }

        double average = computeAverage(total, count);

        System.out.println("============================================");
        System.out.printf("Class Average  :  %.2f%n", average);
        System.out.printf("Highest Score  :  %d%n", highest);
        System.out.printf("Lowest Score   :  %d%n", lowest);
        System.out.printf("Students Passing:  %d / %d%n", passing, count);
        System.out.println("============================================");
    }
}