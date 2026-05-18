package belajarjava;

// import library bawaan Java
import java.util.Scanner;

/*
 * Class utama program
 */
public class MainProgram {

    // Variabel static
    static String sekolah = "SMK Teknologi";

    // Class Sepeda
    static class Sepeda {

        // Variabel instance / atribut
        String warna;
        int kecepatan;
        int gear;

        // Constructor
        Sepeda(String warnaSepeda, int kecepatanAwal, int gearAwal) {
            warna = warnaSepeda;
            kecepatan = kecepatanAwal;
            gear = gearAwal;
        }

        // Method menambah kecepatan
        void tambahKecepatan(int tambah) {
            kecepatan = kecepatan + tambah;
        }

        // Method mengurangi kecepatan
        void kurangiKecepatan(int kurang) {
            kecepatan = kecepatan - kurang;
        }

        // Method pindah gear
        void pindahGear(int gearBaru) {
            gear = gearBaru;
        }

        // Method menampilkan data sepeda
        void tampilkanInfo() {

            System.out.println("===== DATA SEPEDA =====");
            System.out.println("Warna      : " + warna);
            System.out.println("Kecepatan  : " + kecepatan + " km/jam");
            System.out.println("Gear       : " + gear);

            // Operator IF
            if (kecepatan > 30) {
                System.out.println("Status     : Cepat");
            } else {
                System.out.println("Status     : Santai");
            }

            System.out.println("=======================");
        }
    }

    // Method utama Java
    public static void main(String[] args) {

        // Membuat object Scanner
        Scanner input = new Scanner(System.in);

        // Variabel lokal
        String warnaInput;
        int kecepatanInput;
        int gearInput;

        // Input data
        System.out.println("PROGRAM JAVA OOP");
        System.out.println("Sekolah : " + sekolah);

        System.out.print("Masukkan warna sepeda : ");
        warnaInput = input.nextLine();

        System.out.print("Masukkan kecepatan awal : ");
        kecepatanInput = input.nextInt();

        System.out.print("Masukkan gear awal : ");
        gearInput = input.nextInt();

        // Membuat object sepeda
        Sepeda sepedaSaya = new Sepeda(
                warnaInput,
                kecepatanInput,
                gearInput
        );

        // Menampilkan data awal
        System.out.println("\nDATA AWAL");
        sepedaSaya.tampilkanInfo();

        // Operator aritmatika
        sepedaSaya.tambahKecepatan(15);

        // Mengubah gear
        sepedaSaya.pindahGear(3);

        // Menampilkan hasil perubahan
        System.out.println("\nSETELAH DIPERCEPAT");
        sepedaSaya.tampilkanInfo();

        // Operator logika
        boolean cepat = sepedaSaya.kecepatan > 40;

        System.out.println("Apakah sepeda sangat cepat?");
        System.out.println(cepat);

        // Perulangan FOR
        System.out.println("\nPerulangan angka:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        // Menutup Scanner
        input.close();
    }
}