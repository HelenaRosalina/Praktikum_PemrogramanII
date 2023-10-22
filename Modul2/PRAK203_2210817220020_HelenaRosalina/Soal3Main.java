public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //error dikarenakan kurang titik koma (;) pada akhir kode
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        //error dikarenakan pada class Pegawai public void setJabatan(), tidak diisi parameternya
        p1.setJabatan("Assasin");
        //Untuk menambahkan umur pegawai
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Menambahkan tahun pada akhir agar sesuai dengan hasil output dari soal
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
