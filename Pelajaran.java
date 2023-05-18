
public class Pelajaran extends TokoBuku implements Jenis {

    public Pelajaran(String namaBuku, String pengarang, String penerbit, int harga) {
        super(namaBuku, pengarang, penerbit, harga);
    }

    void showDetail() {
        System.out.println("Judul Buku  : " + namaBuku);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Penerbit    : " + penerbit);
    }

    void showHarga() {
        System.out.println("Harga Buku  : " + harga);
    }

    void hitung(int jumlah) {
        int total = (int) (jumlah * harga);
        System.out.println("Total       : " + total);
    }

    public void jenis(String jenis) {
        System.out.println("Jenis Buku  : " + jenis);
    }
    
    public void penjualan(String jual) {
        if (jual == "Laris") {
            System.out.println("Termasuk Buku Best Seller");
        } else if (jual == "Favorit") {
            System.out.println("Termasuk Buku Favorit");
        } else if (jual == "Author") {
            System.out.println("Termasuk Buku dari Author terbaik");
        } else {
            System.out.println("Belum di Ketahui Penjualannya");
        }
    }

}
