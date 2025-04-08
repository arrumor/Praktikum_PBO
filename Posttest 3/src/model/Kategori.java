package model;

public class Kategori{
    private int idKategoriCounter = 1;
    private int idKategori;
    private String nama_kategori;

    public Kategori(int idKategori, String nama_kategori){
        this.idKategori = idKategori;
        this.nama_kategori = nama_kategori;
    }

    public int getIdKategori(){
        return idKategori;
    }

    public String getNamaKategori(){
        return nama_kategori;
    }

    public void set_nama_kategori(String nama_kategori){
        this.nama_kategori = nama_kategori;
    }

    public String dalam_string(){
        return "ID Kategori: " + idKategori + ", Nama Kategori: " + nama_kategori;
    }
}