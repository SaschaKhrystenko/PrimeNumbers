package main;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            for (int i = 1; i <= number; i++) {
                if (primeNumberCheck(i) == true) {
                    System.out.print(i + ", ");
                }
            }
        } else {
            System.out.println("Input value is not Integer");
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
