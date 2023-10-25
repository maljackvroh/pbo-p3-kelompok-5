import java.util.Scanner;

public class buku {
    String judul;
    int halaman;

    public buku(String judul, int halaman) {
        this.judul = judul;
        this.halaman = halaman;
    }

    public buku() {
        this.judul = "harry potter";
        this.halaman = 205;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Judul buku   : ");
        String judul = input.nextLine();

        System.out.print("Halaman buku : ");
        int halaman = input.nextInt();

        buku buku1 = new buku(judul, halaman);

        System.out.println("Informasi Buku 1:");
        System.out.println("Judul: " + buku1.judul);
        System.out.println("Halaman: " + buku1.halaman);

        buku buku2 = new buku();

        System.out.println("Informasi Buku 2:");
        System.out.println("Judul: " + buku2.judul);
        System.out.println("Halaman: " + buku2.halaman);

    }
}
