
import java.util.Scanner;

public class kecepatan {
    int hitungKecepatan;
    int jarak;
    int waktu;

    public kecepatan(int jarak, int waktu) {
        hitungKecepatan = jarak / waktu;
    }

    public int hitungKecepatan() {
        return hitungKecepatan;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jarak tempuh  : ");
        int jarak = input.nextInt();
        System.out.print("Waktu tempuh  : ");
        int waktu = input.nextInt();
        kecepatan hasil = new kecepatan(jarak, waktu);
        System.out.println("Kecepatan tempuh: " + hasil.hitungKecepatan());

    }
}