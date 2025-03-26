import java.util.ArrayList;
import java.util.Scanner;
import model.Admin;
import model.Aksesori;
import model.Kategori;
import service.CRUD;

public class Main {
    private static final ArrayList<Aksesori> dataAksesori = new ArrayList<>();
    private static final ArrayList<Kategori> dataKategori = new ArrayList<>();    
    
    static {
        dataKategori.add(new Kategori(1, "-"));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan, counter = 0;
        String username, password;
        
        Admin admin = new Admin("Admin@mail.com", "admin", "admin");
        
        while (counter < 3){
            System.out.println("=== Login ===");
            System.out.print("Username: ");
            username = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();
            if (!username.equals(admin.getUsername()) || !password.equals(admin.getPassword())) {
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
                switch (pilihan){
                    case 1:
                        CRUD.tambah_aksesori();
                        break;
                    case 2:
                        CRUD.lihat_aksesori();
                        break;
                    case 3:
                        CRUD.ubah_aksesori();
                        break;
                    case 4:
                        CRUD.hapus_aksesori();
                        break;
                    case 5:
                        CRUD.tambah_kategori();
                        break;
                    case 6:
                        CRUD.lihat_kategori();
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
}