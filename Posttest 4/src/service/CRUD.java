package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Aksesori;
import model.Kategori;

public class CRUD {
    public static ArrayList<Aksesori> dataAksesori = new ArrayList<>();
    public static final ArrayList<Kategori> dataKategori = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    private static int Id = 1;
    
    static{
        dataKategori.add(new Kategori(1, "-"));
    }
    
    public static void tambah_aksesori(){
        System.out.println("=== Tambah Aksesori ===");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Merek: ");
        String merek = scanner.nextLine();
        System.out.print("Harga: ");
        int harga = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Pilih Kategori: ");
        lihat_kategori();
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        Kategori kategori = dataKategori.get(pilihan - 1);
        Aksesori aksesori = new Aksesori(Id++, nama, merek, harga, kategori);
        dataAksesori.add(aksesori);
    }

    public static void lihat_aksesori(){
        System.out.println("\n=== Lihat Aksesori ===");
        if (dataAksesori.isEmpty()) {
            System.out.println("Tidak ada aksesori yang tersedia.");
        } else {
            for (int i = 0; i < dataAksesori.size(); i++) {
                System.out.println(dataAksesori.get(i).dalam_string());
            }
        }
    }

    public static void ubah_aksesori(){
        System.out.println("=== Ubah Aksesori ===");
        lihat_aksesori();
        System.out.print("Pilih Aksesori: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        Aksesori aksesori = dataAksesori.get(pilihan - 1);
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Merek: ");
        String merek = scanner.nextLine();
        System.out.print("Harga: ");
        int harga = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Pilih Kategori: ");
        lihat_kategori();
        System.out.print("Pilihan: ");
        int pilihan_kategori = scanner.nextInt();
        scanner.nextLine();
        Kategori kategori = dataKategori.get(pilihan_kategori - 1);
        aksesori.set_nama(nama);
        aksesori.set_merek(merek);
        aksesori.set_harga(harga);
        aksesori.set_kategori(kategori);
    }

    public static void hapus_aksesori(){
        System.out.println("=== Hapus Aksesori ===");
        lihat_aksesori();
        System.out.print("Pilih Aksesori: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        dataAksesori.remove(pilihan - 1);
    }

    public static void tambah_kategori(){
        System.out.println("=== Tambah Kategori ===");
        System.out.print("Nama Kategori: ");
        String nama_kategori = scanner.nextLine();
        Kategori kategori = new Kategori(dataKategori.size() + 1, nama_kategori);
        dataKategori.add(kategori);
    }

    public static void lihat_kategori(){
        System.out.println("\n=== Lihat Kategori ===");
        if (dataKategori.isEmpty()) {
            System.out.println("Tidak ada kategori yang tersedia.");
        } else {
            for (int i = 0; i < dataKategori.size(); i++) {
            System.out.println((i + 1) + ". " + dataKategori.get(i).dalam_string());
            }
        }
    }
}