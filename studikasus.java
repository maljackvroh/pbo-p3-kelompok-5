import java.util.Scanner;

class restoran{
    String namaResto;
    String alamatResto;
    int bnyakMenu = 0;
    private String menu[];
    private String harga[];
    private int kas;

    restoran(String namaResto, String alamatResto){
        this.namaResto = namaResto;
        this.alamatResto = alamatResto;
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
        for(int i = 1; i < menu.length; i++){
            System.out.println(i+" "+menu[i-1]);
            System.out.println("Harga "+harga[i-1]);
        }
    }

    

}


public class studikasus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        restoran rstn = new restoran("Bensu", "Jln Sonokeling");
        
        bool input = true;

        if (input == true){
            System.out.println("Masukan nama menu: ");
            rstn.setMenu(in.nextLine());
            System.out.println("Masukan harga: ");
            rstn.setHarga(in.nextInt());
        } else {
            break;
        }

    }
}
