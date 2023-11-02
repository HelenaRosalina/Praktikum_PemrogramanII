package PRAK301_2210817220020_HelenaRosalina;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Dadu> daftarDadu = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print(" ");
        int jumlahDadu = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daftarDadu.add(dadu);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + dadu.getNilai());
        }
        int jumlahnilai = 0;
        for (Dadu dadu : daftarDadu) {
            jumlahnilai += dadu.getNilai();
        }
        System.out.println("Total nilai dadu keseluruhan " + jumlahnilai);

    }
}
