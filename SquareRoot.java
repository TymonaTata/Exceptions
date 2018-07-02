package pl.swieczkowski.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        double number =0;
        double result = 0;
        boolean wrongInput = true;

        while(wrongInput) {
            try {
                System.out.println("Podaj dowolną dodatnią liczbę:");
                number = sc.nextDouble();

                wrongInput = false;

            } catch (InputMismatchException e) {
                System.out.println("Podałeś niedozwolony znak. Spróbuj jeszcze raz!");


            } finally {
                sc.nextLine();
            }
        }
        sc.close();
        if (number < 0 ) {
            throw new IllegalArgumentException("Liczba powinna być większa lub równa 0");
        }
        result = Math.sqrt(number);
        System.out.println("Pierwiastek kwadratowy z liczby " + number + " wynosi: " + result);

    }
}
