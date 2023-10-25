package jobsheet.akmal_dzaki;

import java.util.Scanner;

class energiP{
    double energiPot;
    final double gravitasi = 9.81;
    double massa;
    double tinggi;

    /* rumus energi potensial. Ep = m × g × h
    m = massa benda
    g = gravitasi
    h = tinggi benda
    */
    energiP(double massa, double gravitasi, double tinggi){
        energiPot = massa*gravitasi*tinggi;
    }
}
public class js9 {
    public static void main(String[] args) {
        // Deklarasi objek scanner
        Scanner obj = new Scanner(System.in);

        // input nilai jarak dan waktu
        System.out.println("\nMasukan massa benda: ");
        int massa = obj.nextInt();
        System.out.println("Masukan tinggi benda: ");
        int tinggi = obj.nextInt();

        // deklarasi objek
        energiP ep = new energiP(massa, energiP.gravitasi, tinggi);

        // tampilkan nilai/data
        System.out.println("Hasil Kecepatan air berdasarkan rumus jarak/waktu: "+air.hitungKecepatan);
    }
}
