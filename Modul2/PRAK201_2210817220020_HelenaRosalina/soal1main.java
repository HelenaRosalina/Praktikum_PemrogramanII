public class soal1main {
    public static void main(String[]args){
    Buah buah1 = new Buah ("Apel", 0.4, 7000.0, 40.0 );
    buah1.buah= "Apel";
    buah1.berat= 0.4;
    buah1.harga= 7000.0;
    buah1.jumlahbeli= 40.0 ;


    Buah buah2 = new Buah("mangga", 0.2, 3500.0, 15.0);
    buah2.buah= "mangga";
    buah2.berat= 0.2;
    buah2.harga= 3500.0;
    buah2.jumlahbeli= 15.0 ;

    Buah buah3 = new Buah("alpukat", 0.25,10000.0, 12.0);
    buah3.buah= "alpukat";
    buah3.berat= 0.25;
    buah3.harga= 10000.0;
    buah3.jumlahbeli= 12.0 ;

        System.out.println("Nama Buah: " +buah1.buah);
        System.out.println("Berat: " +buah1.berat);
        System.out.println("Harga: " +buah1.harga);
        System.out.println("Jumlah Beli: " +buah1.jumlahbeli);

        buah1.pembayaran();
        System.out.println();

        System.out.println("Nama Buah: " +buah2.buah);
        System.out.println("Berat: " +buah2.berat);
        System.out.println("Harga: " +buah2.harga);
        System.out.println("Jumlah Beli: " +buah2.jumlahbeli);

        buah2.pembayaran();
        System.out.println();

        System.out.println("Nama Buah: " +buah3.buah);
        System.out.println("Berat: " +buah3.berat);
        System.out.println("Harga: " +buah3.harga);
        System.out.println("Jumlah Beli: " +buah3.jumlahbeli);

        buah3.pembayaran();
    }

}
