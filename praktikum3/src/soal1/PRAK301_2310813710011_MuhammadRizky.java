package soal1;

import java.util.Random;
import java.util.LinkedList;
import java.util.Scanner;

class Dadu{
    int nilai;
    Random acak = new Random();

    public Dadu(){
        acakNilai();
    }

    public void acakNilai(){
        nilai = acak.nextInt(6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}

public class PRAK301_2310813710011_MuhammadRizky {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahDadu = scan.nextInt();

        LinkedList<Dadu> listDadu = new LinkedList<Dadu>();
        
        for (int i = 0; i < jumlahDadu; i++) {
            listDadu.add(new Dadu());
            System.out.print("Dadu ke-" + (i + 1) + " bernilai " + listDadu.get(i).getNilai() + "\n");
        }

        int totalNilai = 0;
        for (int i = 0; i < jumlahDadu; i++) {
            totalNilai += listDadu.get(i).getNilai();
        }

        System.out.println("Total nilai dadu adalah " + totalNilai);

        scan.close();
    }
}
