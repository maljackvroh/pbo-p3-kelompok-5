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
import java.util.Scanner;
public class potensial {
    double energiPotensial;
    final double gravitasi = 9.81;
 
    public potensial(double massa, double gravitasi, double tinggi) { 
        energiPotensial = massa * gravitasi * tinggi;
    }
    public double getEnergiPotensial() {
    return energiPotensial;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Massa benda: ");
        double massa = input.nextInt();
        System.out.println("Tinggi: ");
        double tinggi = input.nextInt();
        potensial energi = new potensial(massa, 9.81, tinggi);
        double hasilEnergiPotensial = energi.getEnergiPotensial();
        System.out.println("Energi Potensial: " + hasilEnergiPotensial);
 }
}

