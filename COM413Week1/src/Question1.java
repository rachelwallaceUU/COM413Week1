import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your initial: ");
        char initial = scanner.next().charAt(0);

        System.out.print("Enter your surname: ");
        String surname = scanner.next();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Are you employed?: ");
        boolean isEmployed = scanner.nextBoolean();

        scanner.close();

        System.out.println(initial + " " + surname + " is " + age + " years old, is currently " +
                (isEmployed ? "employed" : "not employed") + " and has a salary of £" +
                salary + " per year.");
    }
}