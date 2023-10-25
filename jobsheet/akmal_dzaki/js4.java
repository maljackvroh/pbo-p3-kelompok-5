package jobsheet.akmal_dzaki;


class manusia{
    String nama;
    int umur;
    int makan;
    private double bb;
        

    manusia(){
        this.nama = nama;
        this.umur = umur;
    }

    public void setBb(double bb) {
        bb = 51;
        this.bb = bb+makan;
    }
    
    public double getBb(){
        return bb;
    }
   
}

public class js4 {
    public static void main(String[] args) {
        // deklarasi objek orang
        manusia orang = new manusia();
        orang.nama = "Jack";
        orang.umur = 21;
        orang.makan = 2;
        orang.setBb(50);

        System.out.println("\nNama saya: "+orang.nama);
        System.out.println("Umur saya: "+orang.umur);
        System.out.println("Berat badannya: "+orang.getBb());
    }  
}