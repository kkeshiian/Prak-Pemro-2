package soal2;

import java.util.Scanner;
import java.util.Arrays;

class hewanPeliharan{
    String nama;
    String ras;

    public hewanPeliharan(String n, String r){
        this.nama = n;
        this.ras = r;
    }

    void display(){
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}

class kucing extends hewanPeliharan {
    String warnaBulu;

    public kucing(String n, String r, String w){
        super(n, r);
        this.warnaBulu = w;
    }

    void displayDetailKucing(){
        super.display();
        System.out.println("Memiliki warna bulu: " + warnaBulu);
    }
}

class anjing extends hewanPeliharan {
    String warnaBulu;
    String[] kemampuan;

    public anjing(String n, String r, String w, String[] k){
        super(n, r);
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    void displayDetailAnjing(){
        super.display();
        System.out.println("Warna bulu : " + warnaBulu);
        System.out.println("Memiliki kemampuan : " + Arrays.toString(kemampuan).replace("[", "").replace("]", "").replace(",", ""));
    }
}

public class PRAK402_2310813710011_MuhammadRizky {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pilih jenis hewan yang diinginkan: \n1. Kucing\n2. Anjing\nMasukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        System.out.print("Nama Hewan Peliharaan: ");
        String namaHewan = input.nextLine();
        System.out.print("Ras: ");
        String rasHewan = input.nextLine();
        

        if(pilihan == 1){
            System.out.print("Warna Bulu: ");
            String warnaBulu = input.nextLine();
            kucing kucing = new kucing(namaHewan, rasHewan, warnaBulu);
            kucing.displayDetailKucing();
        } else if(pilihan == 2){
            System.out.print("Warna Bulu: ");
            String warnaBuluAnjing = input.nextLine(); 
            System.out.print("Kemampuan: ");

            String[] kemampuan = input.nextLine().split(",");
            anjing anjing = new anjing(namaHewan, rasHewan, warnaBuluAnjing, kemampuan);
            anjing.displayDetailAnjing();
        } else {
            System.out.println("Pilihan tidak ada");
        }
        
        input.close();
    }
}
