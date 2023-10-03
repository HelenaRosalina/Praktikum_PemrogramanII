package Modul0;

import java.util.Scanner;
public class PRAK105_2210817220020_HelenaRosalina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Masukkan Makanan Favorit: ");
        String makanan = scanner.nextLine();
        System.out.printf("Masukkan Hobi: ");
        String inputhobi = scanner.nextLine();

        System.out.println("Aku Suka Makan " +makanan+ ", dan Hobiku " +inputhobi);
        scanner.close();
    }
}