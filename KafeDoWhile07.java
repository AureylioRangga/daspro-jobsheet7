import java.util.Scanner;
public class KafeDoWhile07 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti

        do {
        
        } while (true);

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
        System.out.print("Masukkan jumlah kopi: ");
        kopi = sc.nextInt();
        System.out.print("Masukkan jumlah teh: ");
        teh = sc.nextInt();
        System.out.print("Masukkan jumlah roti: ");
        roti = sc.nextInt();

        totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("Total yang harus dibayar: Rp " + totalHarga);
        sc.nextLine();
        } while (true);

        }
