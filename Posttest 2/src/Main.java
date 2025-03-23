import model.Aksesori;
import model.Kategori;
import model.Admin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Aksesori> data_aksesori = new ArrayList<Aksesori>();
    private static ArrayList<Kategori> data_kategori = new ArrayList<Kategori>();
    
    static {
        data_kategori.add(new Kategori(1, "-"));
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan, counter = 0;
        String username, password;
        
        Admin admin = new Admin(1, "Admin@mail.com", "admin", "admin");
        
        while (counter < 3){
            System.out.println("=== Login ===");
            System.out.print("Username: ");
            username = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();
            if (!username.equals(admin.get_username()) || !password.equals(admin.get_password())) {
                System.out.println("Username atau password salah");
                if (counter == 2) {
                    System.out.println("Anda telah mencoba 3 kali, akses ditolak");
                    break;
                }
                counter++;
            }
            else {
                System.out.println("\nLogin berhasil!");
                do{
                System.out.println("\n=== Menu Utama ===");
                System.out.println("1. Tambah Aksesori");
                System.out.println("2. Lihat Aksesori");
                System.out.println("3. Ubah Aksesori");
                System.out.println("4. Hapus Aksesori");
                System.out.println("5. Tambah Kategori");
                System.out.println("6. Lihat Kategori");
                System.out.println("7. Keluar");
                System.out.print("Pilihan: ");
                pilihan = scanner.nextInt();
                scanner.nextLine();
                switch(pilihan){
                    case 1:
                        tambah_aksesori();
                        break;
                    case 2:
                        lihat_aksesori();
                        break;
                    case 3:
                        ubah_aksesori();
                        break;
                    case 4:
                        hapus_aksesori();
                        break;
                    case 5:
                        tambah_kategori();
                        break;
                    case 6:
                        lihat_kategori();
                        break;
                    case 7:
                        System.out.println("Terima kasih telah menggunakan program ini");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid");
                        break;
                    }
                } while(pilihan < 8);
            }
        }
    }

    private static void tambah_aksesori(){
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

    private static void lihat_aksesori(){
        System.out.println("\n=== Lihat Aksesori ===");
        if (data_aksesori.isEmpty()) {
            System.out.println("Tidak ada aksesori yang tersedia.");
        } else {
            for (int i = 0; i < data_aksesori.size(); i++) {
            System.out.println((i + 1) + ". " + data_aksesori.get(i).dalam_string());
            }
        }
    }

    private static void ubah_aksesori(){
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

    private static void hapus_aksesori(){
        System.out.println("=== Hapus Aksesori ===");
        lihat_aksesori();
        System.out.print("Pilih Aksesori: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();
        data_aksesori.remove(pilihan - 1);
    }

    private static void tambah_kategori(){
        System.out.println("=== Tambah Kategori ===");
        System.out.print("Nama Kategori: ");
        String nama_kategori = scanner.nextLine();
        Kategori kategori = new Kategori(data_kategori.size() + 1, nama_kategori);
        data_kategori.add(kategori);
    }

    private static void lihat_kategori(){
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