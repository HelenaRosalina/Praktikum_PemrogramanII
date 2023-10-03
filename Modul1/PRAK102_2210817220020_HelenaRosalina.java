package Modul1;

import java.util.Scanner;
public class PRAK102_2210817220020_HelenaRosalina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int AngkaAwal = scanner.nextInt();

        int count = 0;
        int currentNumber = AngkaAwal;

        while (count <= 10) {
            if (currentNumber % 5 == 0) {
                AngkaAwal = (currentNumber / 5) - 1;
            }
            else {
                AngkaAwal = currentNumber;}

            System.out.print(AngkaAwal);

            if (count < 10) {
                System.out.print(", ");
            }

            currentNumber++;
            count++;
        }

        scanner.close();
    }
}