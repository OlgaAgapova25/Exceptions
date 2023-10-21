package HW1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            System.out.println("Result: " + a / b);
        } catch (InputMismatchException e1) {
            System.out.println("Error. Please, provide integers.");
        } catch (ArithmeticException e2) {
            System.out.println("Dividing by 0 is forbidden!");
        }
        sc.close();

    }
}
