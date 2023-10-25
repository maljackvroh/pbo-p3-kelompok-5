package jobsheet.akmal_dzaki;

class laptop {
    // Tipe data 1 - String
    String merek;
    String seri;
    // Tipe data 2 - int
    int tahunKeluar;
    int banyak;

    // constructor 1
    laptop(String merek, String seri) {
        this.merek = merek;
        this.seri = seri;
    }

    // constructor 2
    laptop(int tahunKeluar, int banyak) {
        this.tahunKeluar = tahunKeluar;
        this.banyak = banyak;
    }
}

public class js5 {
    public static void main(String[] args) {
        // deklarasi objek 1 & 2
        laptop barang1 = new laptop("Asus", "X47cu");
        laptop barang2 = new laptop(2023, 1240);
        
        // dipanggillll 
        System.out.println("\nNama merek\t: "+barang1.merek);
        System.out.println("Seri\t\t: "+ barang1.seri);
        System.out.println("Tahun keluar\t: "+barang2.tahunKeluar);
        System.out.println("Banyak Unit\t: "+barang2.banyak);
    }
}
