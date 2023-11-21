package soal2;
abstract class HewanPeliharaan {
    protected String nama;
    protected String ras;

    public HewanPeliharaan(String r, String n) {
        ras = r;
        nama = n;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}