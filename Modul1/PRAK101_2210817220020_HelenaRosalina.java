package Modul1;

import java.util.Scanner;
public class PRAK101_2210817220020_HelenaRosalina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatlahir = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggallahir = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        int tb = scanner.nextInt();

        System.out.print("Masukkan Berat Badan (kg): ");
        double bb = scanner.nextDouble();

        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatlahir + " pada Tanggal " + tanggallahir + " " + getBulan(bulanLahir) + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tb + " cm dan Berat Badan " + bb + " kilogram");

        scanner.close();
    }

    public static String getBulan(int bulan) {
        String[] Bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        if (bulan >= 1 && bulan <= 12) {
            return Bulan[bulan - 1];
        } else {
            return "Bulan tidak valid";
        }
    }
}