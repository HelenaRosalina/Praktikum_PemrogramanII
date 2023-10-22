//Pada baris ini error dikarenakan nama class yang digunakan salah
public class Pegawai {

    public String nama;
    //error dikarenakan pada class Pegawai asal menggunakan tipe data char, yang mana seharusnya menggunakan tipe data string
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //Pada baris ini error dikarenakan public void setJabatan(), tidak diisi parameternya
    //public void setJabatan() {
    public void setJabatan(String jabatan) {
        //Pada baris ini error dikarenakan variabel j yang tidak dideklarasikan dalam metode setJabatan,
        //yang mana seharusnya menggunakan variabel jabatan yang diterima sebagai argumen dalam metode.
        //this.jabatan = j;
        this.jabatan = jabatan;
    }
    //ditambahkan agar bisa menampilkan umur
    public int getUmur() {
        return umur;
    }
}
