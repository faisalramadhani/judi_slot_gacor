import java.util.Scanner;

public class KehadiranKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahKaryawan = 5; // Ganti dengan jumlah karyawan yang sesuai
        String[] namaKaryawan = new String[jumlahKaryawan];
        boolean[] hadir = new boolean[jumlahKaryawan];

        // Inisialisasi array kehadiran ke false
        for (int i = 0; i < jumlahKaryawan; i++) {
            hadir[i] = false;
        }

        System.out.println("Selamat datang di Sistem Pencatatan Kehadiran Karyawan");

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.print("Masukkan nama karyawan ke-" + (i + 1) + ": ");
            namaKaryawan[i] = input.nextLine();
        }

        while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Cek kehadiran karyawan");
            System.out.println("2. Daftar karyawan");
            System.out.println("3. Keluar");

            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nomor karyawan (1 - " + jumlahKaryawan + "): ");
                    int nomorKaryawan = input.nextInt();

                    if (nomorKaryawan >= 1 && nomorKaryawan <= jumlahKaryawan) {
                        int indeks = nomorKaryawan - 1;
                        hadir[indeks] = true;
                        System.out.println(namaKaryawan[indeks] + " telah hadir.");
                    } else {
                        System.out.println("Nomor karyawan tidak valid.");
                    }
                    break;

                case 2:
                    System.out.println("Daftar Karyawan dan Kehadiran:");
                    for (int i = 0; i < jumlahKaryawan; i++) {
                        String status = hadir[i] ? "Hadir" : "Tidak Hadir";
                        System.out.println((i + 1) + ". " + namaKaryawan[i] + " - " + status);
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
