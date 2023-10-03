package Modul1;

import java.util.Scanner;
public class PRAK103_2210817220020_HelenaRosalina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        System.out.print("Masukkan bilangan awal: ");
        int AngkaAwal = scanner.nextInt();

        int count = 0;
        int currentNumber = AngkaAwal;

        System.out.print("Output: ");

        do {
            if (currentNumber % 2 != 0) {
                System.out.print(currentNumber);

                if (count < n - 1) {
                    System.out.print(", ");
                }

                count++;
            }

            currentNumber++;
        } while (count < n);

        scanner.close();
    }
}