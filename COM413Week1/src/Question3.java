import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueGoing = true;

        while (continueGoing) {
            System.out.println("Enter value: ");
            int value = scanner.nextInt();

            if (value % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }

            System.out.println("Do you want to continue? (Y/N): ");
            char response = scanner.next().toUpperCase().charAt(0);

            if (response != 'Y') {
                continueGoing = false;
            }

        }
        scanner.close();
    }
}
