package jobsheet.akmal_dzaki;

import java.util.Scanner;

class debitAir {
    int hitungDebit;
    int volume;
    int waktu;

    // Rumus Debit = Volume / Waktu
    debitAir(int volume, int waktu){
        hitungDebit = volume/waktu;
    }
}

public class js7 {
    public static void main(String[] args) {
        // Deklarasi objek scanner
        Scanner obj = new Scanner(System.in);

        // input nilai volume dan waktu
        System.out.println("\nMasukan volume: ");
        int volume = obj.nextInt();
        System.out.println("Masukan Waktu: ");
        int waktu = obj.nextInt();

        // deklarasi objek
        debitAir air = new debitAir(volume, waktu);

        // tampilkan nilai/data
        System.out.println("Hasil debit air berdasarkan rumus v/t: "+air.hitungDebit);
    }
}
