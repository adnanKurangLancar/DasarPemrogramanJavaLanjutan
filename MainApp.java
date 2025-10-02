import model.Mahasiswa; // mengimpor class Mahasiswa dari package 'model'

public class MainApp {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Adnan Ramadan", "23123456", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Budi Santoso", "23123457", "Sistem Informasi");

        // Menampilkan data mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        mhs1.tampilData();
        System.out.println("----------------------");
        mhs2.tampilData();
    }
}

