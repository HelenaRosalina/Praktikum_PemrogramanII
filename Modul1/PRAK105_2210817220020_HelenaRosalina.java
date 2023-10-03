package Modul1;

import java.util.Scanner;
public class PRAK105_2210817220020_HelenaRosalina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PHI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double r = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = scanner.nextDouble();

        double v = PHI * r * r * t;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m^3%n", r, t, v);

        scanner.close();
    }
}
