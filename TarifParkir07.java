import java.util.Scanner;
public class TarifParkir07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // Deklarasi variabel
        int jenis, lama;
        double totalBayar = 0;
        double tarif = 0;

        // Menampilkan menu parkir
        System.out.println("========= Program parkir =========");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("0. Selesai");

        // Menggunakan do-while loop untuk input berulang
        do {
            System.out.print("Masukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Berhenti): ");
            jenis = sc.nextInt();
        
        // Mengecek jika user ingin berhenti
            if (jenis == 0) {
                break;
            }

        // Meminta input lama parkir
            System.out.print("Masukkan lama parkir (jam)\t: ");
            lama = sc.nextInt();

        // Menghitung tarif berdasarkan jenis kendaraan dan lama parkir
            if (lama > 5) {
                tarif = 12500;
            } else if (jenis == 1) {
                tarif = lama * 3000;
            } else if (jenis == 2) {
                tarif = lama * 2000;
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }

        // Menambahkan tarif ke total bayar
            totalBayar += tarif;
            System.out.println("Biaya parkir\t\t\t: Rp " + tarif);
            System.out.println();

        // Akhir dari do-while loop
        } while (true);

        // Menampilkan total pembayaran parkir
        System.out.println("=== Total Pembayaran Parkir ===");
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
    }
}
