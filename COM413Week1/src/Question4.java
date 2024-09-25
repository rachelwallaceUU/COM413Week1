import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Printing numbers from 1 to 10 using a while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // Print numbers from 1 to 10 using a for loop (unconditional loop)
        System.out.println("\nPrinting numbers from 1 to 10 using a for loop:");
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }


    }
}