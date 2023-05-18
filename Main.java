
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Pertama-tama, program mengimpor kelas Scanner yang diperlukan untuk membaca masukan pengguna. Setelah itu, program membuat objek Scanner baru dengan nama "input".
        Scanner input = new Scanner(System.in);
        // Selanjutnya, program menampilkan beberapa baris teks ke layar, yaitu "Kasir StarBook", daftar pilihan buku, dan instruksi untuk memilih buku.
        System.out.println("======================================");
        System.out.println("             Kasir StarBook           ");
        System.out.println("======================================");
        System.out.println("Pilihan Buku :");
        System.out.println("1. Komik");
        System.out.println("2. Novel");
        System.out.println("3. Pelajaran");
        System.out.println("4. Religious");
        System.out.println("-------------");
        System.out.print("Pilih : ");
        // Terakhir, program meminta pengguna untuk memilih salah satu pilihan buku dengan menggunakan metode "nextInt()" dari objek "input". Pilihan yang dipilih akan disimpan ke dalam variabel "menu".
        int menu = input.nextInt();
        // codingan tersebut menggunakan switch-case untuk mengecek nilai dari variabel menu. Jika variabel menu memiliki nilai 1, maka program akan menjalankan blok kode yang terdapat pada case 1. Pada blok kode ini, program akan menampilkan daftar buku komik beserta ID-nya. Kemudian, program akan meminta input ID dari pengguna.
        switch (menu) {
            case 1:
                System.out.println("======================================");
                System.out.println("                 KOMIK                ");
                System.out.println("======================================");
                System.out.println("One Piece       (ID = KO001)");
                System.out.println("Doraemon        (ID = KO002)");
                System.out.println("Detektif Conan  (ID = KO003)");
                System.out.println("-------------");
                System.out.print("Masukkan ID : ");
                String id = input.next();
                switch (id) {
                    case "KO001":
                        System.out.println("-------------");
                        Komik km1 = new Komik("One Piece", "Akira Toriyama", "Bird Studio", 25000);
                        km1.showDetail();
                        km1.jenis("Fiksi");
                        km1.penjualan("Laris");
                        km1.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        int jumlah = input.nextInt();
                        System.out.println();
                        km1.hitung(jumlah);
                        break;
                        //Ini adalah switch case kedua dalam program kasir buku. Jika pilihan menu pertama yang dipilih adalah '1', yaitu komik, maka akan muncul opsi buku komik yang bisa dibeli. Pada case "KO001" yang dipiganya.lih, maka program akan menampilkan detail buku "One Piece" beserta dengan ID dan har

                        // Kemudian program akan meminta input jumlah buku yang ingin dibeli, yang akan disimpan dalam variabel "jumlah". Setelah itu, program akan memanggil method "hitung" pada object km1 (buku One Piece) dan akan mem-passing jumlah yang diinputkan oleh user.

                        // Method "hitung" akan menghitung harga total buku yang akan dibeli, kemudian akan menampilkan hasilnya. Selain itu, pada case "KO001", method "jenis" dan "penjualan" juga dipanggil pada object km1. Kemudian, program akan keluar dari switch case ini dan melanjutkan ke bagian selanjutnya dari program kasir buku.

                    case "KO002":
                        System.out.println("-------------");
                        Komik km2 = new Komik("Doraemon", "Fujiko", "Elex Media Komputindo", 30000);
                        km2.showDetail();
                        km2.jenis("Fiksi");
                        km2.penjualan("Author");
                        km2.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        km2.hitung(jumlah);
                        break;
                    case "KO003":
                        System.out.println("-------------");
                        Komik km3 = new Komik("Detektif Conan", "Gosho Aoyama", "Elex Media Komputindo", 23000);
                        km3.showDetail();
                        km3.jenis("Fiksi");
                        km3.penjualan("Laris");
                        km3.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        km3.hitung(jumlah);
                        break;
                    default:
                        System.out.println("ID buku tidak ditemukan");
                }
                break;
            case 2:
                System.out.println("======================================");
                System.out.println("                 NOVEL                ");
                System.out.println("======================================");
                System.out.println("Komet Minor             (ID = NO001)");
                System.out.println("This is Why I Need You  (ID = NO002)");
                System.out.println("The Wanker              (ID = NO003)");
                System.out.println("-------------");
                System.out.print("Masukkan ID : ");
                id = input.next();
                switch (id) {
                    case "NO001":
                        System.out.println("-------------");
                        Novel nv1 = new Novel("Komet Minor", "Tere Liye", "PT Gramedia Pustaka Utama", 90000);
                        nv1.showDetail();
                        nv1.jenis("Fiksi");
                        nv1.penjualan("Laris");
                        nv1.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        int jumlah = input.nextInt();
                        System.out.println();
                        nv1.hitung(jumlah);
                        break;
                    case "NO002":
                        System.out.println("-------------");
                        Novel nv2 = new Novel("This is Why I Need You", "Brian Khrisna", "Media Kita", 100000);
                        nv2.showDetail();
                        nv2.jenis("Fiksi");
                        nv2.penjualan("Favorit");
                        nv2.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        nv2.hitung(jumlah);
                        break;
                    case "NO003":
                        System.out.println("-------------");
                        Novel nv3 = new Novel("The Wanker", "Alia Zalea", "PT Gramedia Pustaka Utama", 80000);
                        nv3.showDetail();
                        nv3.jenis("Fiksi");
                        nv3.penjualan("Baru");
                        nv3.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        nv3.hitung(jumlah);
                        break;

                    default:
                        System.out.println("ID buku tidak ditemukan");
                }
                break;
            case 3:
                System.out.println("======================================");
                System.out.println("               PELAJARAN              ");
                System.out.println("======================================");
                System.out.println("Ensiklopedia              (ID = PE001)");
                System.out.println("Ilmu Pengetahuan Alam     (ID = PE002)");
                System.out.println("Ilmu Geografi             (ID = PE003)");
                System.out.println("-------------");
                System.out.print("Masukkan ID : ");
                id = input.next();
                switch (id) {
                    case "PE001":
                        System.out.println("-------------");
                        Pelajaran pj1 = new Pelajaran("Ensiklopedia", "Widodo dan Tjandra", "Suka Maju", 95000);
                        pj1.showDetail();
                        pj1.jenis("Non Fiksi");
                        pj1.penjualan("Baru");
                        pj1.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        int jumlah = input.nextInt();
                        System.out.println();
                        pj1.hitung(jumlah);
                        break;
                    case "PE002":
                        System.out.println("-------------");
                        Pelajaran pj2 = new Pelajaran("Ilmu Pengetahuan Alam", "Sandijaya dan Retno", "Gramed", 125000);
                        pj2.showDetail();
                        pj2.jenis("Non Fiksi");
                        pj2.penjualan("Laris");
                        pj2.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        pj2.hitung(jumlah);
                        break;
                    case "PE003":
                        System.out.println("-------------");
                        Pelajaran pj3 = new Pelajaran("Ilmu Geografi", "Wijaya dan Kirana", "Kurnia", 145000);
                        pj3.showDetail();
                        pj3.jenis("Non Fiksi");
                        pj3.penjualan("Laris");
                        pj3.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        pj3.hitung(jumlah);
                        break;

                    default:
                        System.out.println("ID buku tidak ditemukan");
                }
                break;
            case 4:
                System.out.println("======================================");
                System.out.println("            RELIGIOUS                 ");
                System.out.println("======================================");
                System.out.println("Al-Quran                  (ID = RE001)");
                System.out.println("Spiritualitas             (ID = RE002)");
                System.out.println("Kisah Para Nabi           (ID = RE003)");
                System.out.println("-------------");
                System.out.print("Masukkan ID : ");
                id = input.next();
                switch (id) {
                    case "RE001":
                        System.out.println("-------------");
                        Religious re1 = new Religious("Al-Quran", "Abdurrahman bin Nashir As-Sa'di", "Mizan Pustaka", 65000);
                        re1.showDetail();
                        re1.jenis("Fiksi");
                        re1.penjualan("Laris");
                        re1.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        int jumlah = input.nextInt();
                        System.out.println();
                        re1.hitung(jumlah);
                        break;
                    case "RE002":
                        System.out.println("-------------");
                        Komik re2 = new Komik("Spiritualitas", "Ahmad Fuadi", "Penerbit Erlangga", 78000);
                        re2.showDetail();
                        re2.jenis("Fiksi");
                        re2.penjualan("Author");
                        re2.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        re2.hitung(jumlah);
                        break;
                    case "RE003":
                        System.out.println("-------------");
                        Komik re3 = new Komik("Kisah Para Nabi", "Ilana Tan", "Penerbit Republika", 23000);
                        re3.showDetail();
                        re3.jenis("Fiksi");
                        re3.penjualan("Laris");
                        re3.showHarga();
                        System.out.println();
                        System.out.print("Masukkan Jumlah Buku : ");
                        jumlah = input.nextInt();
                        System.out.println();
                        re3.hitung(jumlah);
                        break;
                    default:
                        System.out.println("ID buku tidak ditemukan");
                }
                break;

                default:
            System.out.println("buku tidak ditemukan");
        }
    }
}
