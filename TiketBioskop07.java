import java.util.Scanner;
public class TiketBioskop07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Deklarasi variabel
        int jumlahTiket, totalTiket = 0;
        int hargaTiket = 50000;
        int totalHarga = 0;
        int totalDiskon = 0;
        int totalBayar = 0;

        // Menggunakan loop untuk input berulang
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk berhenti): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            } else if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif.");
                continue;
            }

        // Menghitung harga dan diskon
            int harga = jumlahTiket * hargaTiket;
            int diskon = 0;

        // Menentukan diskon berdasarkan jumlah tiket
            if (jumlahTiket > 10) {
                diskon = (int)(harga * 0.15);
            } else if (jumlahTiket > 4) {
                diskon = (int)(harga * 0.10);
            }

        // Menghitung total bayar setelah diskon
            int bayar = harga - diskon;

        // Menampilkan hasil perhitungan
            System.out.println("======== Program Penjualan Tiket Bioskop ========");
            System.out.println("Harga sebelum diskon\t: Rp " + harga);
            System.out.println("Diskon\t\t\t: Rp " + diskon);
            System.out.println("Total bayar\t\t: Rp " + bayar);
            System.out.println("=================================================");

        // Menambahkan ke total keseluruhan
            totalTiket += jumlahTiket;
            totalHarga += harga;
            totalDiskon += diskon;
            totalBayar += bayar;
        }

        // Menampilkan rekap hasil penjualan
        System.out.println("=========== Rekap Hasil Penjualan Hari ini ===========");
        System.out.println("Total tiket terjual\t\t: " + totalTiket);
        System.out.println("Total harga sebelum diskon\t: Rp " + totalHarga);
        System.out.println("Total diskon diberikan\t\t: Rp " + totalDiskon);
        System.out.println("Total pendapatan(diskon)\t: Rp " + totalBayar);
        System.out.println("======================================================");
        sc.close();
    }
}
