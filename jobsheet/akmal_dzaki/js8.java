package jobsheet.akmal_dzaki;

import java.util.Scanner;

class car {
    int hitungKecepatan;
    int jarak;
    int waktu;

    // Rumus Kecepatan = jarak / Waktu
    car(int jarak, int waktu){
        hitungKecepatan = jarak/waktu;
    }
}

public class js8 {
    public static void main(String[] args) {
        // Deklarasi objek scanner
        Scanner obj = new Scanner(System.in);

        // input nilai jarak dan waktu
        System.out.println("\nMasukan jarak: ");
        int jarak = obj.nextInt();
        System.out.println("Masukan Waktu: ");
        int waktu = obj.nextInt();

        // deklarasi objek
        car bil = new car(jarak, waktu);

        // tampilkan nilai/data
        System.out.println("Hasil Kecepatan air berdasarkan rumus jarak/waktu: "+bil.hitungKecepatan);
    }
}
