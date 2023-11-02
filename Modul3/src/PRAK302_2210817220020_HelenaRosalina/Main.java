package PRAK302_2210817220020_HelenaRosalina;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        int jumlahNegara = scanner.nextInt();
        scanner.nextLine();
        LinkedList<Negara> daftarNegara = new LinkedList<>();

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = scanner.nextLine();


            int tanggalKemerdekaan = 0, bulanKemerdekaan = 0, tahunKemerdekaan = 0;
            if (!jenisKepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = scanner.nextInt();
                bulanKemerdekaan = scanner.nextInt();
                tahunKemerdekaan = scanner.nextInt();
                scanner.nextLine();
            }

            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            daftarNegara.add(negara);
        }


        System.out.println("\n");
        for (Negara negara : daftarNegara) {
            negara.tampilkanDetail();
            System.out.println();
        }
    }
}

