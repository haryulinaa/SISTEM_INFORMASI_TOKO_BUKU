public class Novel extends TokoBuku implements Jenis, Penjualan {

    public Novel(String namaBuku, String pengarang, String penerbit, int harga) {
        super(namaBuku, pengarang, penerbit, harga);
    }
    // Constructor ini menerima argumen namaBuku, pengarang, penerbit, dan harga untuk menginisialisasi objek Novel.
    // Constructor ini juga memanggil constructor dari superclass TokoBuku menggunakan super(namaBuku, pengarang, penerbit, harga).
    
    void showDetail() {
        System.out.println("Judul Buku  : " + namaBuku);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Penerbit    : " + penerbit);
    }
    // Method ini digunakan untuk menampilkan detail buku seperti judul buku, pengarang, dan penerbit.

    void showHarga() {
        System.out.println("Harga Buku  : " + harga);
    }
    // Method ini digunakan untuk menampilkan harga buku.

    void hitung(int jumlah) {
        int total = (int) (jumlah * harga);
        System.out.println("Total       : " + total);
    }
    // Method ini menghitung total harga berdasarkan jumlah buku yang dibeli, menggunakan rumus total = jumlah * harga.
    // Total harga kemudian ditampilkan.

    public void jenis(String jenis) {
        System.out.println("Jenis Buku  : " + jenis);
    }
    // Method ini menerapkan interface Jenis dan digunakan untuk menampilkan jenis buku.

    public void penjualan(String jual) {
        if (jual == "Laris") {
            System.out.println("Termasuk Novel Best Seller");
        } else if (jual == "Favorit") {
            System.out.println("Termasuk Novel Favorit");
        } else if (jual == "Author") {
            System.out.println("Termasuk Novel dari Author terbaik");
        } else {
            System.out.println("Belum di Ketahui Penjualannya");
        }
    }
    // Method ini menerapkan interface Penjualan dan digunakan untuk menampilkan informasi penjualan buku berdasarkan kategori penjualan.
    // Jika nilai jual adalah "Laris", akan ditampilkan pesan "Termasuk Novel Best Seller".
    // Jika nilai jual adalah "Favorit", akan ditampilkan pesan "Termasuk Novel Favorit".
    // Jika nilai jual adalah "Author", akan ditampilkan pesan "Termasuk Novel dari Author terbaik".
    // Jika nilai jual tidak cocok dengan kondisi di atas, akan ditampilkan pesan "Belum di Ketahui Penjualannya".
}
