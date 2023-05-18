public class Komik extends TokoBuku implements Jenis {
    // Mendefinisikan kelas Komik yang merupakan turunan dari kelas TokoBuku dan mengimplementasikan interface Jenis. Konstruktor Komik dengan parameter namaBuku, pengarang, penerbit, dan harga dipanggil dari konstruktor kelas induk TokoBuku menggunakan super().
    
    public Komik(String namaBuku, String pengarang, String penerbit, int harga) {
        super(namaBuku, pengarang, penerbit, harga);
    }
    // Method showDetail() digunakan untuk menampilkan detail dari suatu buku komik seperti judul, pengarang, dan penerbit.
    void showDetail() {
        System.out.println("Judul Buku  : " + namaBuku);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Penerbit    : " + penerbit);
    }
    // Method showHarga() digunakan untuk menampilkan harga dari suatu buku komik.
    void showHarga() {
        System.out.println("Harga Buku  : " + harga);
    }
    // Method hitung() digunakan untuk menghitung total harga dari suatu buku komik berdasarkan jumlah yang dibeli.
    void hitung(int jumlah) {
        int total = (int) (jumlah * harga);
        System.out.println("Total       : " + total);
    }
    // Method jenis() merupakan implementasi dari method pada interface Jenis dan digunakan untuk menampilkan jenis dari buku komik.
    public void jenis(String jenis) {
        System.out.println("Jenis Buku  : " + jenis);
    }
    // Method penjualan() digunakan untuk menampilkan informasi penjualan dari suatu buku komik berdasarkan kriteria tertentu seperti "Laris", "Favorit", atau "Author".
    public void penjualan(String jual) {
        if (jual == "Laris") {
            System.out.println("Termasuk Komik Best Seller");
        } else if (jual == "Favorit") {
            System.out.println("Termasuk Komik Favorit");
        } else if (jual == "Author") {
            System.out.println("Termasuk Komik dari Author terbaik");
        } else {
            System.out.println("Belum di Ketahui Penjualannya");
        }
    }

}
