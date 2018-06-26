package pl.swieczkowski.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number;
        double result;
        boolean wrongInput = true;

        while(wrongInput) {
            try {
                System.out.println("Podaj dowolną liczbę większą od 0:");
                number = sc.nextDouble();

                if (number <= 0) throw new IllegalArgumentException();

                wrongInput = false;
                result = Math.sqrt(number);
                System.out.println("Pierwiastek kwadratowy z liczby " + number + " wynosi: " + result);

            } catch (InputMismatchException e) {
                System.out.println("Podałeś niedozwolony znak. Spróbuj jeszcze raz!");

            } catch (IllegalArgumentException e) {
                System.out.print("Podałeś liczbę ujemną spróbuj. jeszcze raz! ");
            } finally {
                sc.nextLine();
            }
        }

    }
}
