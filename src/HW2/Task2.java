package HW2;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.math.BigDecimal.divide;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Введите первое целое число: ");
            int a = sc.nextInt();
            System.out.print("Введите второе целое число: ");
            int b = sc.nextInt();
            divide(a, b);
        } catch (InputMismatchException e1) {
            System.out.println("Ошибка: некорректный ввод. Вводите целые числа!");
        } catch (DivisionByZeroException e2) {
            System.out.println(e2.getMessage());
        }
        sc.nextLine();
        System.out.println();
    }
}
