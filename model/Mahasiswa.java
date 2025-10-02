package model; // mendeklarasikan bahwa class Mahasiswa ada di package 'model'

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    // Constructor -> untuk membuat objek mahasiswa baru
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method getter untuk mengambil data mahasiswa
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    // Method untuk menampilkan data mahasiswa
    public void tampilData() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }
}
