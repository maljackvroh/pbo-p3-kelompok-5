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

public class Nilai_Mahasiswa{
    String mk;
    int nilai;

    public Nilai_Mahasiswa(String mk, int nilai) {
        this.mk = mk;
        this.nilai = nilai;
    }

    public static void main(String[] args) {
        Nilai_Mahasiswa mahasiswa = new Nilai_Mahasiswa("PBO", 80);

        System.out.println("Mata Kuliah: " + mahasiswa.mk);
        System.out.println("Nilai: " + mahasiswa.nilai);
    }
}


