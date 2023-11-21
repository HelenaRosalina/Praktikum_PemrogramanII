package soal2;
class Kucing extends HewanPeliharaan {
    private String Bulu;

    public Kucing(String r, String n, String w) {
        super(r, n);
        Bulu = w;
    }

    public void displayDetailKucing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + Bulu);
    }
}
