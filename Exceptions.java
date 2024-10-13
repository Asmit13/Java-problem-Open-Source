import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int result = 10 / 0;
            System.out.println("Result: " + result);

            // NullPointerException
            String str = null;
            System.out.println(str.length());

            // ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]);

            // FileNotFoundException
            FileReader reader = new FileReader("nonexistent.txt");

            // InputMismatchException
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            // Other checked exceptions (e.g., IOException, SQLException)
            // ...

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (NullPointerException e) {
            System.out.println("Error: Attempt to access null object.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input format.");
        } catch (IOException e) {
            System.out.println("Error: I/O error occurred.");
        } catch (Exception e) {
            System.out.println("Error: Unexpected exception occurred.");
            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
