package GajiKaryawan;

import java.util.Scanner;

public class GajiKaryawan {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String golongan;
        int jamLembur;
        double gajiPokok = 0;
        double persen = 0;
        double gajiLembur;
        double totalGaji;

        //Input
        System.out.print("Masukkan Golongan (A/B/C): ");
        golongan = input.nextLine();

        System.out.print("Masukkan Jam Lembur: ");
        jamLembur = input.nextInt();

        // Gaji Pokok
        if (golongan.equalsIgnoreCase("A")) {
            gajiPokok = 5000000;
           }   else if (golongan.equalsIgnoreCase("B")) {
            gajiPokok = 6500000;
           }    else if (golongan.equalsIgnoreCase("C")) {
            gajiPokok = 9500000;
           }    else {
            System.out.println("Golongan tidak valid!");
            input.close();
            return;
           }
            
        // Lembur
        if (jamLembur == 1){
            persen = 0.30;
        } else if (jamLembur == 2) {
            persen = 0.32;
        } else if (jamLembur == 3) {
            persen = 0.34;
        }else if (jamLembur == 4) {
            persen = 0.36;
        } else if (jamLembur >= 5) {
            persen = 0.38;
        }

        // Hitung
        gajiLembur = gajiPokok * persen;
        totalGaji = gajiPokok + gajiLembur;

        //Output
        System.out.println("\n=== HASIL ===");
        System.out.println("Golongan    : " + golongan.toUpperCase());
        System.out.println("Gaji pokok : Rp " + gajiPokok);
        System.out.println("Lembur    : Rp " + gajiPokok);
        System.out.println("Total Gaji   : Rp " + totalGaji);

        input.close();
    }
}