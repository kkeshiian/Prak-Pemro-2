package soal3;

import java.util.Scanner;
import java.util.ArrayList;

class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String toString() {
        return "Nama: " + nama + "\nNIM: " + nim;
    }
}

public class PRAK303_2310813710011_MuhammadRizky {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Mahasiswa> dataMahasiswa = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 0:
                    System.out.println("Terima kasih");
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("Masukkan Nama Mahasiswa:");
                    String nama = scan.nextLine();
                    System.out.println("Masukkan NIM Mahasiswa (harus unik)");
                    String nim = scan.nextLine();

                    boolean NIMunik = true;

                    for (Mahasiswa mahasiswa : dataMahasiswa) {
                        if (mahasiswa.getNim().equals(nim)) {
                            NIMunik = false;
                            break;
                        }
                    }

                    if (NIMunik) {
                        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                        dataMahasiswa.add(mahasiswa);
                        System.out.println("Mahasiswa " + mahasiswa.getNama() + " ditambahkan");
                    } else {
                        System.out.println("NIM harus unik. Mahasiswa tidak ditambahkan");
                    }

                    break;

                case 2:
                    System.out.println("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = scan.nextLine();

                    boolean ditemukanHapus = false;
                    for (int i = 0; i < dataMahasiswa.size(); i++) {
                        Mahasiswa mahasiswa = dataMahasiswa.get(i);
                        if (mahasiswa.getNim().equals(nimHapus)) {
                            dataMahasiswa.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus");
                            ditemukanHapus = true;
                            break;
                        }
                    }
                    if (!ditemukanHapus) {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan");
                    }
                    break;

                case 3:
                    System.out.println("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String nimCari = scan.nextLine();

                    boolean ditemukanCari = false;
                    for (Mahasiswa mahasiswa : dataMahasiswa) {
                        if (mahasiswa.getNim().equals(nimCari)) {
                            System.out.println("Mahasiswa ditemukan: ");
                            System.out.println(mahasiswa);
                            ditemukanCari = true;
                            break;
                        }
                    }
                    if (!ditemukanCari) {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan");
                    }
                    break;

                case 4:
                    if (dataMahasiswa.isEmpty()) {
                        System.out.println("Daftar Mahasiswa kosong.");
                    } else {
                        System.out.println("Daftar Mahasiswa: ");
                        for (Mahasiswa mahasiswa : dataMahasiswa) {
                            System.out.println(mahasiswa);
                        }
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan pilih lagi.");
                    break;
            }
        }
    }
}
