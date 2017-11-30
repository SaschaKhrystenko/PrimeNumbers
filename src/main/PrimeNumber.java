package main;

import java.util.InputMismatchException;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter Integer");
        }

        for (int i = 1; i <= number; i++) {
            if (primeNumberCheck(i) == true) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean primeNumberCheck(Integer n) {
        if (n == 1)
            return false;
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0)
                return false;
        }
        return true;
    }
}
