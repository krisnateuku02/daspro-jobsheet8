
import java.util.Scanner;

public class tugas315 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = input.nextInt();

        int totalSeluruhBarang = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 1;

        for (int toko = 1; toko <= jumlahToko; toko++) {
           System.out.print("Masukkan jumlah pelanggan toko " + toko + ": ");
            int jumlahPelanggan = input.nextInt();
            int totalBarangToko = 0;

            for (int pelanggan = 1;
                 pelanggan <= jumlahPelanggan; pelanggan++) {
                System.out.print("Masukkan jumlah barang pelanggan " + pelanggan + ": ");
                int jumlahBarang = input.nextInt();
                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + toko
                    + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko);

            totalSeluruhBarang += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println("Total barang seluruh toko: "
                + totalSeluruhBarang);
        System.out.println("Toko dengan barang terbanyak: "
                + tokoTerbanyak);

        input.close();
    }
}

