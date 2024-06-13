import java.util.Scanner;

public class PengeluaranUang {
    public static void main(String[] args) {
        double[] pendapatanBulanan = new double[3];
        String[] namaBulan = {"Januari", "Februari", "Maret"};
        String status;

        Scanner scanner = new Scanner(System.in);
        int Bulan = 0;
        while (Bulan < 3) {
            System.out.println("Masukkan Pengeluaran Bulan " + namaBulan[Bulan] + ": ");
            double Pendapatan = scanner.nextDouble();
            pendapatanBulanan[Bulan] = Pendapatan;
            Bulan++;
        }

        double totalPendapatan = 0;
        int Pendapatan = 0;
        while (Pendapatan < pendapatanBulanan.length) {
        totalPendapatan += pendapatanBulanan[Pendapatan];
        Pendapatan++;
}


        if (totalPendapatan > 20_000_000) {
            status = "Boros Banget";
        } else if (totalPendapatan > 10_000_000) {
            status = "Hemat";
        } else {
            status = "Wow Sangat Hemat";
        }

        System.out.println("\nTotal Pengeluaran Rp " + String.format("%,.2f", totalPendapatan));
        System.out.println("Status Keuangan: " + status);

        scanner.close();
    }
}
