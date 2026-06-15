public class ProfileCard {
    public static void main(String[] args) {

        String firstName = "ESTA"; // Stores the student's first name
        String lastName = "CHARLESS"; // Stores the student's last name
        String studentId = "2024-04-01079"; // Stores the student ID number
        String yearOfStudy = "2nd Year"; // Stores the current year of study

        String programmingBackground = "I have foundational knowledge in electronics and communication systems.\n" +
                "             I am developing skills in both hardware and software integration."; // Stores programming experience

        String courseGoal = "I want to strengthen my practical skills in electronic science and communication\n" +
                "             and apply them to real-world solutions."; // Stores goal for the course

        String funFact = "I enjoy listening to music and exploring new fashion trends in my free time"; // Stores a fun fact about the student


        System.out.println("====================================================================================");
        System.out.println("                       CS 234 — JAVA PROFILE CARD                                  ");
        System.out.println("====================================================================================");

        System.out.println("Name            : " + firstName + " " + lastName);
        System.out.println("Student ID      : " + studentId);
        System.out.println("Year of Study   : " + yearOfStudy);

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Background      : " + programmingBackground);

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Course Goal     : " + courseGoal);

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Fun Fact        : " + funFact);

        System.out.println("====================================================================================");
    }
}
