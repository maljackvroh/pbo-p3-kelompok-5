/*Bikin aplikasi pilih salah satu
1. Meubel
2. Data plat kendaraan

Harus ada
1. Constructor tanpa parameter
2. Constructor dengan parameter
3. Jumlah atribut bebas

Batas pengumpulan jam 12 malem
 */

package tugas_ac;

import java.util.Scanner;

class kendaraan{
    String plat;

    public kendaraan(){

    }

    public kendaraan(String plat){
        this.plat = plat;
    }

    public void setPlat(String plat){
        this.plat = plat;
    }

    public String getPlat(){
        return plat;
    }

    public void printData(){
        System.out.println("Plat kendaraan: "+plat);
    }
}

public class akmal_dzaki {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan jumlah kendaraan: ");
        int qty = in.nextInt();

        kendaraan[] kendaraanList = new kendaraan[qty];

        for (int i = 0; i < qty; i++){
            System.out.print("Input plat kendaraan "+(i+1)+": ");
            String plat = in.next();
            kendaraanList[i] = new kendaraan(plat);
        }

        for (kendaraan kendaraan: kendaraanList){
            kendaraan.printData();
        }
    }
}

