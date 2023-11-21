package soal1;
import java.util.Scanner;
public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String r, String n) {
        ras = r;
        nama = n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        nama = scanner.nextLine();

        System.out.print("Ras: ");
        ras = scanner.nextLine();

        System.out.println();
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}