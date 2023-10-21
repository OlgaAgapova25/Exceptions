package HW1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("How old are you? ");
                String userInput = sc.nextLine();
                int age = Integer.parseInt(userInput);
                System.out.println("Your age: " + age);
                    break;
            } catch (NumberFormatException ex) {
                System.out.println("Некорректный ввод!");
            }
        }
        sc.close();
    }
}
