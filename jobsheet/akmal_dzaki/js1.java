package jobsheet.akmal_dzaki;

class mobil{
    String nama;
    String warna;

    mobil(){
        this.nama = nama;
        this.warna = warna;
    }
}

public class js1 {
    public static void main(String[] args) {
        mobil mobil1 = new mobil();

        mobil1.nama = "Lamborgini";
        mobil1.warna  = "black Dove";

        System.out.println("\nNama mobil itu "+mobil1.nama);
        System.out.println("Mobil itu berwarna "+ mobil1.warna);
    }
}