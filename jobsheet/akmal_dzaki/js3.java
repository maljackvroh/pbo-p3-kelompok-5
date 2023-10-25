package jobsheet.akmal_dzaki;
class operasi{
    String tambah;
    int a;
    int b;
    int hasil;

    operasi(int a, int b){
        hasil = a + b;
    }
}
public class js3 {
    public static void main(String[] args) {
        operasi plus = new operasi(10, 55);

        plus.tambah = "Pertambahan";

        System.out.println("\nOperasi ini bernama "+ plus.tambah);
        System.out.println("Hasil dari 10 + 55 = "+plus.hasil);
    }
}
