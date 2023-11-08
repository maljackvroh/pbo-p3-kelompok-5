import java.util.Scanner;

class restoran{
    String namaResto;
    String alamatResto;
    int bnyakMenu;
    String menu[];
    int harga[];
    boolean input;

    restoran(String namaResto, String alamatResto){
        this.namaResto = namaResto;
        this.alamatResto = alamatResto;
        menu = new String[20];
        harga = new int[20];
    }

    public void setMenu(String newMenu){
        menu[bnyakMenu] = newMenu;
    }

    public void setHarga(int newHarga){
        harga[bnyakMenu] = newHarga;
    }

    public void getMenu(){
        System.out.println("Berikut daftar menu: ");
        for(int i = 0; i < bnyakMenu; i++){
            System.out.println(i+"  "+menu[i]);
            System.out.println("   Harga "+harga[i]);
        }
    }

    

}


public class studikasus {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        restoran rstn = new restoran("Bensu", "Jln Sonokeling");

        do{
            System.out.println("Masukan nama menu: ");
            rstn.setMenu(in.next());

            System.out.println("Masukan harga: ");
            rstn.setHarga(in.nextInt());
            rstn.bnyakMenu++;
            System.out.println("Apakah anda ingin memasukan data lagi?(true/false)");
            rstn.input = in.nextBoolean();

        } while(rstn.input == true);


        rstn.getMenu();

    }
}