class Kategori{
    private int id_kategori_counter = 1;
    private int id_kategori;
    private String nama_kategori;

    public Kategori(int id_kategori, String nama_kategori){
        this.id_kategori = id_kategori;
        this.nama_kategori = nama_kategori;
    }

    public int get_id_kategori(){
        return id_kategori;
    }

    public String getNamaKategori(){
        return nama_kategori;
    }

    public void setNamaKategori(String nama_kategori){
        this.nama_kategori = nama_kategori;
    }

    public String dalam_string(){
        return "ID Kategori: " + id_kategori + ", Nama Kategori: " + nama_kategori;
    }
}