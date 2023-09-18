package Modul1;

import java.util.Scanner;
public class PRAK105_2210817220020_HelenaRosalina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Masukkan Makanan Favorit: ");
        String inputmakanan = scanner.nextLine();
        System.out.printf("Masukkan Hobi: ");
        String inputhobi = scanner.nextLine();

        System.out.println("Aku Suka Makan " +inputmakanan+ ", dan Hobiku " +inputhobi);
        scanner.close();
    }
}