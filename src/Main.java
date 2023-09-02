import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задача № 1.
        Scanner sc = new Scanner(System.in);
        int a = getInt(sc, "Enter base value (integer except 0): ");
        int b = getInt(sc, "Enter pow value (natural number): ");
        PowerCalculator pc = new PowerCalculator();
        try{
            System.out.printf("Result: %s", pc.calculatePower(a, b));
        }catch (InvalidInputException ex){
            System.out.println(ex.getMessage());
        }
        sc.close();
    }

    public static int getInt(Scanner scanner, String message) {
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Error: you've entered an incorrect number.");
                scanner.next(); // Очистка буфера сканера
            }
        }
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class PowerCalculator {
    public double calculatePower(int a, int b) throws InvalidInputException {
        if (a == 0) {
            throw new InvalidInputException("Error: base = 0");
        } else if (b < 0) {
            throw new InvalidInputException("Error: pow value is negative");
        }
        return Math.pow(a, b);

    }
}