public class Identitas {
    String nim;
    String nama;
    int kelompok;

    public Identitas(String nama, String nim, int kelompok) {
        this.nama = nama;
        this.nim = nim;
        this.kelompok = kelompok;
    }

    public static void main(String[] args) {
        Identitas mahasiswa = new Identitas("Hakimura", "F1B045004", 20);
        System.out.println("Nama: " + mahasiswa.nama);
        System.out.println("NIM: " + mahasiswa.nim);
        System.out.println("Kelompok: " + mahasiswa.kelompok);
    }
}
