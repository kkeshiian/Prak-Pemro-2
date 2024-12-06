package soal1;

import java.util.Scanner;

class hewanPeliharan {
    String n;
    String r;

    public hewanPeliharan(String n, String r){
        this.n = n;
        this.r = r;
    }

    void display(){
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah: " + n);
        System.out.println("Dengan ras: " + r);
    }
}

public class PRAK401_2310813710011_MuhammadRizky {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String namaHewan = input.nextLine();
        System.out.print("Ras: ");
        String rasHewan = input.nextLine();

        hewanPeliharan hewan = new hewanPeliharan(namaHewan, rasHewan);
        hewan.display();

        input.close();
    }
}
