import java.util.Scanner;

public class IT22199058Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];

        int i = 0;
        while (i < 8) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int studentId = input.nextInt();

            if (studentId <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                continue;
            }

            studentsArray[i] = studentId;
            i++;
        }

        System.out.println();
        System.out.print("Enter a Student ID to Search: ");
        int searchId = input.nextInt();

        boolean found = false;
        for (i = 0; i < 8; i++) {
            if (studentsArray[i] == searchId) {
                found = true;
                break;
            }
        }

        System.out.println();
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}