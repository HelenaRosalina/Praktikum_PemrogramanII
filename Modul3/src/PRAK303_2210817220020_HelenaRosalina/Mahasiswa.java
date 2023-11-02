package PRAK303_2210817220020_HelenaRosalina;
import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }
}