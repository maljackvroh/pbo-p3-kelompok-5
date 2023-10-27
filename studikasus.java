import java.util.Scanner;

class restoran{
    String namaResto;
    String alamatResto;
    int bnyakMenu = 0;
    String menu[];
    String harga[];

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
        
        boolean input = true;

        do{
            System.out.println("Masukan nama menu: ");
            rstn.setMenu(in.next());

            System.out.println("Masukan harga: ");
            rstn.setHarga(in.next());

            System.out.println("Apakah anda ingin memasukan data lagi?(Y/N)");
            String pil = in.next();

            if(pil == "Y"){
                input = true;
            } else if(pil == "N") {
                input = false;
            } else{
                System.out.println("Inputan anda salah!");
                input = false;
            }
        } while(input = true);


        rstn.getMenu();

    }
}