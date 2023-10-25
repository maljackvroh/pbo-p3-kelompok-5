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
public class Mobil{ 
    private String nama;
    private int tahun;

    public Mobil() {
        nama = "Hyundai";
        tahun = 1967;
    }
    public  Mobil(String nm, int tahun) {
        this.tahun = tahun;
        this.nama = nm;
    }
    public String getNama(){
        return nama;
    }
    public int getTahun(){
        return tahun;
    }

    public static void main(String[] args){
        Mobil mbl1 = new Mobil("SUV", 1980);
        System.out.println("Jenis Mobil: " + mbl1.getNama());
        System.out.println("Tahun Mobil: " + mbl1.getTahun());
        System.out.println("");
        System.out.println("");
        
        Mobil mbl2 = new Mobil();
        System.out.println("Jenis mobil: " + mbl2.nama);
        System.out.println("Tahun mobil: " + mbl2.tahun);
 }
}
