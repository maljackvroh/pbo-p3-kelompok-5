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
public class birthday {
    String hari;
    String bulan;
    int tanggal;
    int tahun;
    
    public birthday(String hari, String bulan) {
        this.hari = hari;
        this.bulan = bulan;
    }
    public birthday(int tanggal, int tahun) {
        this.tanggal = tanggal;
        this.tahun = tahun;
    }
    public static void main(String[] args) {
    birthday lahir1 = new birthday("Kamis", "Oktober");
    birthday lahir2 = new birthday(30, 2002);
    
    System.out.println("Hari : " + lahir1.hari);
    System.out.println("Tanggal: " + lahir2.tanggal);
    System.out.println("Bulan : " + lahir1.bulan);
    System.out.println("Tahun : " + lahir2.tahun);
 }
}
