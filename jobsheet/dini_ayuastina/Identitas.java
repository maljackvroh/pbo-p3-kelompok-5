/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3;

/**
 *
 * @author DINI AYUASTINA
 */
public class Identitas{
    String nama;
    String nim;
    int kelompok;
    String kbk;
    String alamat;
    
    public Identitas (String nama, String nim, int kelompok, String kbk, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.kelompok = kelompok;
        this.kbk = kbk;
        this.alamat = alamat;
    
}
    public static void main(String[] args) {
        Identitas mahasiswa = new Identitas("Dini Ayuastina", "F1B021114", 5, "Teknik Komputer", "Lombok Utara");

        System.out.println("Nama: " + mahasiswa.nama);
        System.out.println("NIM: " + mahasiswa.nim);
        System.out.println("Kelompok: " + mahasiswa.kelompok);
        System.out.println("KBK: " + mahasiswa.kbk);
        System.out.println("Alamat: " + mahasiswa.alamat);
    }
}
