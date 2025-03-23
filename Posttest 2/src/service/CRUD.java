package service;

import model.Aksesori;
import model.Kategori;

import java.util.ArrayList;
import java.util.Scanner;

public class CRUD {
    public static ArrayList<Aksesori> data_aksesori = new ArrayList<Aksesori>();
    public static ArrayList<Kategori> data_kategori = new ArrayList<Kategori>();
    public static Scanner scanner = new Scanner(System.in);

    public CRUD(ArrayList<Aksesori> data_aksesori, ArrayList<Kategori> data_kategori, Scanner scanner) {
        this.data_aksesori = data_aksesori;
        this.data_kategori = data_kategori;
        this.scanner = scanner;
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
        Kategori kategori = data_kategori.get(pilihan - 1);
        Aksesori aksesori = new Aksesori(data_aksesori.size() + 1, nama, merek, harga, kategori);
        data_aksesori.add(aksesori);
    }

    public static void lihat_aksesori(){
        System.out.println("\n=== Lihat Aksesori ===");
        if (data_aksesori.isEmpty()) {
            System.out.println("Tidak ada aksesori yang tersedia.");
        } else {
            for (int i = 0; i < data_aksesori.size(); i++) {
            System.out.println((i + 1) + ". " + data_aksesori.get(i).dalam_string());
            }
        }
    }

    public static void ubah_aksesori(){
        System.out.println("=== Ubah Aksesori ===");
        lihat_aksesori();
        System.out.print("Pilih Aksesori: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        Aksesori aksesori = data_aksesori.get(pilihan - 1);
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
        Kategori kategori = data_kategori.get(pilihan_kategori - 1);
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
        data_aksesori.remove(pilihan - 1);
    }

    public static void tambah_kategori(){
        System.out.println("=== Tambah Kategori ===");
        System.out.print("Nama Kategori: ");
        String nama_kategori = scanner.nextLine();
        Kategori kategori = new Kategori(data_kategori.size() + 1, nama_kategori);
        data_kategori.add(kategori);
    }

    public static void lihat_kategori(){
        System.out.println("\n=== Lihat Kategori ===");
        if (data_kategori.isEmpty()) {
            System.out.println("Tidak ada kategori yang tersedia.");
        } else {
            for (int i = 0; i < data_kategori.size(); i++) {
            System.out.println((i + 1) + ". " + data_kategori.get(i).dalam_string());
            }
        }
    }
}