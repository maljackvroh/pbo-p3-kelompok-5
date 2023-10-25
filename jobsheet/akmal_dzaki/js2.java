package jobsheet.akmal_dzaki;

class motor{
    String nama;
    String warna;

    motor(String nama, String warna){
        this.nama = nama;
        this.warna = warna;
    }
}

public class js2 {
    public static void main(String[] args) {
        motor motor1 = new motor("Ducati","Red Devil");

        System.out.println("\nMotor "+motor1.nama+" itu keren!");
        System.out.println("Motor "+motor1.nama+" itu berwarna "+motor1.warna);
    }
}
