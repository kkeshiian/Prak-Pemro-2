package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class Negara{
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan){
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public int getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }

    public int getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }

    public int getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }
}


public class PRAK302_2310813710011_MuhammadRizky {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahNegara = scan.nextInt();
        scan.nextLine();

        LinkedList<Negara> listNegara = new LinkedList<>();
        HashMap<Integer, String> namaBulan = new HashMap<>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");

        for (int i = 0; i < jumlahNegara; i++) {
            String nama = scan.nextLine();
            String jenisKepemimpinan = scan.nextLine();
            String namaPemimpin = scan.nextLine();
            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;
            
            if(!jenisKepemimpinan.equals("monarki")){
                tanggalKemerdekaan = scan.nextInt();
                bulanKemerdekaan = scan.nextInt();
                tahunKemerdekaan = scan.nextInt();
                scan.nextLine();
            }

            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            listNegara.add(negara);
        }

        for (Negara negara : listNegara) {
            System.out.println("Negara " + negara.getNama() + " mempunyai " + (negara.getJenisKepemimpinan().equals("monarki") ? "Raja" :
            (negara.getJenisKepemimpinan().equals("presiden") ? "Presiden" : "Perdana Menteri")) + " bernama " + negara.getNamaPemimpin());

            if (!negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Deklarasi kemerdekaan pada tanggal " + negara.getTanggalKemerdekaan() + " " + namaBulan.get(negara.getBulanKemerdekaan()) + " " + negara.getTahunKemerdekaan());
            }
        }
        scan.close();
    }
}
