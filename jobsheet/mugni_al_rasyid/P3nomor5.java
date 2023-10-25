public class birthday {
    String hari;
    String bulan;
    int tanggal;
    int tahun;

    public birthday(String hari, String bulan) {

        this.hari = hari;
        this.bulan = bulan;
    }

    public birthday(int tanggal, int tahun) {
        this.tanggal = tanggal;
        this.tahun = tahun;
    }

    public static void main(String[] args) {
        birthday lahir1 = new birthday("senin", "Oktober");
        birthday lahir2 = new birthday(2, 2003);
        System.out.println("Hari   : " + lahir1.hari);
        System.out.println("Tanggal: " + lahir2.tanggal);
        System.out.println("Bulan  : " + lahir1.bulan);
        System.out.println("Tahun  : " + lahir2.tahun);
    }
}