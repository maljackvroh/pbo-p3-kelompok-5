class kucing{
    String nama;
    int umur;
    double makan;
    double berat;
    double beratHasil;

    kucing(){
        nama = "nama";
        umur = 2;
    }

    kucing(double makan, double berat){
        this.beratHasil = makan + berat;
    }


}

public class acc {
    public static void main(String[] args) {
        kucing cat = new kucing();
        kucing eat = new kucing(5.4, 21.0);

        System.out.println("Nama kucing ini: "+cat.nama);
        System.out.println("Dengan umur: "+cat.umur);
        
        System.out.println("Setalah makan berat badan dia menjadi: "+eat.beratHasil);
    }   
}
