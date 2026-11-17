import java.util.ArrayList;
import java.util.Scanner;

public class FlexibleEntries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers would you like to input? ");
        int numberOfEntries = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numberOfEntries; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("You entered the following numbers: " + numbers);
        scanner.close();
    }
}
