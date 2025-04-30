package model;

public final class Kategori{
    private final int idKategori;
    public String nama_kategori;

    public Kategori(int idKategori, String nama_kategori){
        this.idKategori = idKategori;
        this.nama_kategori = nama_kategori;
    }

    public String getNamaKategori(){
        return nama_kategori;
    }

    public String dalam_string(){
        return "ID: " + idKategori + ", Nama Kategori: " + nama_kategori;
    }
}