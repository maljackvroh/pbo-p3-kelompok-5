import java.util.Scanner;

class restoran{
    String namaResto;
    String alamatResto;
    int bnyakMenu = 0;
    String menu[];
    String harga[];
    boolean input;

    restoran(String namaResto, String alamatResto){
        this.namaResto = namaResto;
        this.alamatResto = alamatResto;
        menu = new String[20];
        harga = new String[20];
    }

    public void setMenu(String newMenu){
        menu[bnyakMenu] = newMenu;
        bnyakMenu++;
    }

    public void setHarga(String newHarga){
        menu[bnyakMenu] = newHarga;
        bnyakMenu++;
    }

    public void getMenu(){
        System.out.println("Berikut daftar menu: ");
        for(int i = 1; i < bnyakMenu; i++){
            System.out.println(i+" "+menu[i-1]);
            System.out.println("Harga "+harga[i-1]);
        }
    }

    

}


public class studikasus {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        restoran rstn = new restoran("Bensu", "Jln Sonokeling");
        
        int input;

        do{
            System.out.println("Masukan nama menu: ");
            rstn.setMenu(in.next());

            System.out.println("Masukan harga: ");
            rstn.setHarga(in.next());

            System.out.println("Apakah anda ingin memasukan data lagi?(1/0)");
            rstn.input = in.nextBoolean();

        } while(rstn.input == true);


        rstn.getMenu();

    }
}