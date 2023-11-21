package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();

        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String namaPeliharaan = scanner.nextLine();

            System.out.print("Ras: ");
            String rasPeliharaan = scanner.nextLine();

            System.out.print("Warna Bulu: ");
            String Bulu = scanner.nextLine();
            System.out.println();

            Kucing kucing = new Kucing(rasPeliharaan, namaPeliharaan, Bulu);
            kucing.displayDetailKucing();
        }

        else if (pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String namaPeliharaan = scanner.nextLine();

            System.out.print("Ras: ");
            String rasPeliharaan = scanner.nextLine();

            System.out.print("Warna Bulu: ");
            String Bulu = scanner.nextLine();

            System.out.print("Kemampuan: ");
            String inputKemampuan = scanner.nextLine();
            String[] kemampuanAnjing = inputKemampuan.split(", ");
            System.out.println();

            Anjing anjing = new Anjing(namaPeliharaan, rasPeliharaan, Bulu, kemampuanAnjing);
            anjing.displayDetailAnjing();
        }
        else {
            System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}