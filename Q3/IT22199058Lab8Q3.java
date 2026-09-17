import java.util.Scanner;

public class IT22199058Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];

        int i = 0;
        while (i < 6) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                continue;
            }

            numbers[i] = number;
            i++;
        }

        int max = numbers[0];
        for (i = 1; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println();
        System.out.println("Array Contents:");
        for (i = 0; i < 6; i++) {
            System.out.print(numbers[i]);
            if (i < 5) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("The Maximum Number Entered: " + max);

        input.close();
    }
}