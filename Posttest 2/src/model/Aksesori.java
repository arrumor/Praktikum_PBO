package model;

public class Aksesori{
    private int id_counter = 1;
    private int id;
    private String nama;
    private String merek;
    private int harga;
    private Kategori kategori;

    public Aksesori(int id, String nama, String merek, int harga, Kategori kategori){
        this.id = id;
        this.nama = nama;
        this.merek = merek;
        this.harga = harga;
        this.kategori = kategori;
    }

    public int get_id(){
        return id;
    }
    public String get_nama(){
        return nama;
    }
    public String get_merek(){
        return merek;
    }
    public int get_harga(){
        return harga;
    }
    public Kategori get_kategori(){
        return kategori;
    }


    public void set_nama(String nama){
        this.nama = nama;
    }
    public void set_merek(String merek){
        this.merek = merek;
    }
    public void set_harga(int harga){
        this.harga = harga;
    }
    public void set_kategori(Kategori kategori){
        this.kategori = kategori;
    }


    public String dalam_string(){
        return "ID: " + id + ", Nama: " + nama + ", Merek: " + merek + ", Harga: Rp" + harga + ", Kategori: " + (kategori != null ? kategori.getNamaKategori() : "Belum ada kategori");
    }
}