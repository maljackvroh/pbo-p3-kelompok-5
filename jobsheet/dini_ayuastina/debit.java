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

public class debit {
    int hitungDebit;
    int volume;
    int waktu;
    
    public debit(int volume, int waktu) {
        hitungDebit = volume / waktu;
    }
    public int hitungDebit() {
        return hitungDebit;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Volume Air16: ");
        int volume = input.nextInt();
        System.out.println("Waktu: ");
        int waktu = input.nextInt();
 
        debit nilai = new debit(volume, waktu);
        System.out.println("Debit air: " + nilai.hitungDebit);
 }
}
