package PRAK303_2210817220020_HelenaRosalina;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = scanner.nextLine();

                    boolean nimtelahterdaftar = false;
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNIM().equals(nim)) {
                            nimtelahterdaftar = true;
                            break;
                        }
                    }

                    if (!nimtelahterdaftar) {
                        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                        daftarMahasiswa.add(mahasiswa);
                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    } else {
                        System.out.println("NIM sudah digunakan.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimdihapus = scanner.nextLine();

                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNIM().equals(nimdihapus)) {
                            daftarMahasiswa.remove(mhs);
                            System.out.println("Mahasiswa dengan NIM " + nimdihapus + " dihapus.");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String mencariNIM = scanner.nextLine();

                    boolean mahasiswadidapatkan = false;
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNIM().equals(mencariNIM)) {
                            System.out.println("NIM: " + mhs.getNIM() + ", Nama: " + mhs.getNama());
                            mahasiswadidapatkan = true;
                            break;
                        }
                    }
                    if (!mahasiswadidapatkan) {
                        System.out.println("Mahasiswa dengan NIM " + mencariNIM + " tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        System.out.println("NIM: " + mhs.getNIM() + ", Nama: " + mhs.getNama());
                    }
                    break;

                case 0:
                    System.out.println("Terima Kasih!");
                    daftarMahasiswa.clear();
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
    }
}