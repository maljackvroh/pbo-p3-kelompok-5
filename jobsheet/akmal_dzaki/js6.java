package jobsheet.akmal_dzaki;

import java.util.Scanner;

class tab {
    // Tipe data 1 - String
    String merek;
    String seri;
    // Tipe data 2 - int
    int tahunKeluar;
    int banyak;

    // constructor 1
    tab(String merek) {
        this.merek = merek;
    }

    // constructor 2
    tab() {
        this.seri = seri;
        this.tahunKeluar = tahunKeluar;
        this.banyak = banyak;
    }
}

public class js6 {
    public static void main(String[] args) {
        // deklarasi objek 1 & 2
        tab barang1 = new tab("Iphone");
        tab barang2 = new tab();

        // deklarasi objek scanner dengan nama obj untuk baca inputan dinamis
        Scanner obj = new Scanner(System.in);
        
        // Bagian untuk input data dinamis
        System.out.println("Masukan Seri tab: ");
        barang2.seri = obj.nextLine();
        System.out.println("Masukan Tahun Keluar: ");
        barang2.tahunKeluar = obj.nextInt();
        System.out.println("Masukan banyak unit: ");
        barang2.banyak = obj.nextInt();

        // Bagian untuk menampilkan data 
        System.out.println("\nNama merek\t: "+barang1.merek);
        System.out.println("Seri\t\t: "+ barang2.seri);
        System.out.println("Tahun keluar\t: "+barang2.tahunKeluar);
        System.out.println("Banyak Unit\t: "+barang2.banyak);
    }
}
