package jobsheet.akmal_dzaki;

class Scincare{
    String produk;
    int harga;

    public Scincare(String produk, int harga){
        this.produk = produk;
        this.harga = harga;
    }
}
public class aksdja {
  public static void main(String[] args) {
    Scincare mahasiswa = new Scincare( "hanasui", 21);
    
    System.out.println("\nproduk:" + mahasiswa.produk);
    System.out.println("harga:" + mahasiswa.harga );
  }  
}