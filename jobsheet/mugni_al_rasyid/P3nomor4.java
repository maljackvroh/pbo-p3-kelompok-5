package percobaan3;

public class mobil {
private String nama;
private int tahun;

public mobil() {
nama = "Avanza";
tahun = 2003;
}
 public mobil(String nm, int tahun) {
this.tahun = tahun;
this.nama = nm;
}
public String getNama() {
return nama;
}
public int getTahun() {
return tahun;
}

public static void main(String[] args) {
mobil mbl1 = new mobil("Xpander", 2012);
System.out.println("Jenis mobil: " + mbl1.getNama());
System.out.println("Tahun mobil: " + mbl1.getTahun());
System.out.println("");
System.out.println("");
mobil mbl2 = new mobil();
System.out.println("Jenis mobil: " + mbl2.nama);
System.out.println("Tahun mobil: " + mbl2.tahun);
}
}