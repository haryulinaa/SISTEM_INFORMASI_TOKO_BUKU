public abstract class TokoBuku {

    public String namaBuku;
    public String pengarang;
    public String penerbit;
    public int harga;

    TokoBuku(String namaBuku, String pengarang, String penerbit, int harga) {
        this.namaBuku = namaBuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.harga = harga;
    }

    abstract void showDetail();

    abstract void showHarga();

    abstract void hitung(int jumlah);

}

// Ini adalah kelas abstrak TokoBuku yang memiliki beberapa atribut dan metode abstrak. Atributnya adalah namaBuku, pengarang, penerbit, dan harga yang merepresentasikan informasi dasar tentang sebuah buku. Konstruktor TokoBuku digunakan untuk menginisialisasi nilai-nilai atribut. Kelas ini memiliki tiga metode abstrak yaitu showDetail(), showHarga(), dan hitung(int jumlah) yang nantinya akan diimplementasikan di kelas turunan. Metode showDetail() akan menampilkan informasi detail tentang buku, showHarga() akan menampilkan harga buku, dan hitung(int jumlah) akan menghitung total harga berdasarkan jumlah buku yang dibeli.
