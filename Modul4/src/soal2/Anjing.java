package soal2;
class Anjing extends HewanPeliharaan {
    private String Bulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(r, n);
        Bulu = w;
        kemampuan = k;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + Bulu);
        System.out.print("Memiliki kemampuan : ");

        for (int i = 0; i < kemampuan.length; i++) {
            System.out.print(kemampuan[i]);

            if (i < kemampuan.length - 1) {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
