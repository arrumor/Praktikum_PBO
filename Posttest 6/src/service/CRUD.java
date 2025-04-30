package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.Aksesori;
import model.Kategori;

public class CRUD {
    public static final ArrayList<Aksesori> dataAksesori = new ArrayList<>();
    public static final ArrayList<Kategori> dataKategori = new ArrayList<>();
    public static final Scanner scanner = new Scanner(System.in);
    private static int Id = 1;
    
    static{
        dataKategori.add(new Kategori(1, "-"));
    }
    
    public static final void tambah_aksesori() {
        System.out.println("=== Tambah Aksesori ===");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Merek: ");
        String merek = scanner.nextLine();

        int harga = 0;
        while (true) {
            try {
                System.out.print("Harga: ");
                harga = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Input tidak valid. Harap masukkan angka untuk harga.");
                scanner.nextLine();
            }
        }

        System.out.println("Pilih Kategori: ");
        lihat_kategori();

        int pilihan = 0;
        while (true) {
            try {
                System.out.print("Pilihan: ");
                pilihan = scanner.nextInt();
                if (pilihan < 1 || pilihan > dataKategori.size()) {
                    System.out.println("Pilihan tidak valid. Silakan pilih kategori yang tersedia.");
                    continue;
                }
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Input tidak valid. Harap masukkan angka untuk pilihan kategori.");
                scanner.nextLine();
            }
        }

        Kategori kategori = dataKategori.get(pilihan - 1);
        Aksesori aksesori = new Aksesori(Id++, nama, merek, harga, kategori);
        dataAksesori.add(aksesori);
    }

    public static final void lihat_aksesori(){
        System.out.println("\n=== Lihat Aksesori ===");
        if (dataAksesori.isEmpty()) {
            System.out.println("Tidak ada aksesori yang tersedia.");
        } else {
            for (Aksesori aksesori : dataAksesori) {
                System.out.println(aksesori.dalam_string());
            }
        }
    }

    public static final void ubah_aksesori() {
        System.out.println("=== Ubah Aksesori ===");
        lihat_aksesori();

        int pilihan = 0;
        while (true) {
            try {
                System.out.print("Pilih Aksesori: ");
                pilihan = scanner.nextInt();
                if (pilihan < 1 || pilihan > dataAksesori.size()) {
                    System.out.println("Pilihan tidak valid. Silakan pilih aksesori yang tersedia.");
                    continue;
                }
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Input tidak valid. Harap masukkan angka untuk memilih aksesori.");
                scanner.nextLine();
            }
        }

        Aksesori aksesori = dataAksesori.get(pilihan - 1);

        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Merek: ");
        String merek = scanner.nextLine();

        int harga = 0;
        while (true) {
            try {
                System.out.print("Harga: ");
                harga = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Input tidak valid. Harap masukkan angka untuk harga.");
                scanner.nextLine();
            }
        }

        System.out.println("Pilih Kategori: ");
        lihat_kategori();

        int pilihan_kategori = 0;
        while (true) {
            try {
                System.out.print("Pilihan: ");
                pilihan_kategori = scanner.nextInt();
                if (pilihan_kategori < 1 || pilihan_kategori > dataKategori.size()) {
                    System.out.println("Pilihan tidak valid. Silakan pilih kategori yang tersedia.");
                    continue;
                }
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Input tidak valid. Harap masukkan angka untuk pilihan kategori.");
                scanner.nextLine();
            }
        }

        Kategori kategori = dataKategori.get(pilihan_kategori - 1);
        aksesori.set_nama(nama);
        aksesori.set_merek(merek);
        aksesori.set_harga(harga);
        aksesori.set_kategori(kategori);
    }

    public static final void hapus_aksesori(){
        System.out.println("=== Hapus Aksesori ===");
        lihat_aksesori();
        System.out.print("Pilih Aksesori: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        dataAksesori.remove(pilihan - 1);
    }

    public static final void tambah_kategori(){
        System.out.println("=== Tambah Kategori ===");
        System.out.print("Nama Kategori: ");
        String nama_kategori = scanner.nextLine();
        Kategori kategori = new Kategori(dataKategori.size() + 1, nama_kategori);
        dataKategori.add(kategori);
    }

    public static final void lihat_kategori(){
        System.out.println("\n=== Lihat Kategori ===");
        if (dataKategori.isEmpty()) {
            System.out.println("Tidak ada kategori yang tersedia.");
        } else {
            for (int i = 0; i < dataKategori.size(); i++) {
            System.out.println(dataKategori.get(i).dalam_string());
            }
        }
    }
}