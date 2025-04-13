import Universitas.Mahasiswa;
import Universitas.ManajemenMahasiswa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa dengan IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Prodi : ");
                    String prodi = input.nextLine();
                    System.out.print("Masukkan IPK   : ");
                    double ipk = input.nextDouble();
                    input.nextLine(); 
                    manajemen.tambah(new Mahasiswa(nim, nama, prodi, ipk));
                    break;

                case 2:
                    manajemen.tampilkanSemua();
                    break;

                case 3:
                    manajemen.tampilkanIPKTertinggi();
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }
}
