public class Buah {
    String buah;
    double berat, harga, jumlahbeli, hargasebelumdiskon, totaldiskon, hargasetelahdiskon;

    public Buah(String buah,double berat, double harga, double jumlahbeli){
        this.buah=buah;
        this.berat=berat;
        this.harga=harga;
        this.jumlahbeli=jumlahbeli;

    }
    void pembayaran(){
        hargasebelumdiskon=jumlahbeli/berat*harga;
        totaldiskon=0.02 * (4 * harga) * Math.floor(jumlahbeli/4);
        hargasetelahdiskon=hargasebelumdiskon-totaldiskon;

        System.out.println("Harga Sebelum Diskon: " +hargasebelumdiskon);
        System.out.println("Total Diskon: " +totaldiskon);
        System.out.println("Harga Setelah Diskon: " +hargasetelahdiskon);
    }
}
