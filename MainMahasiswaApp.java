public class MainMahasiswaApp {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mhs = new Mahasiswa("Adnan", "23123456", "Informatika");

        // Menampilkan data awal yyyy
        System.out.println("=== Data Mahasiswa Awal ===");
        mhs.tampilData();

        // Mengubah data menggunakan setter
        mhs.setNama("Adnan Ramadan");
        mhs.setJurusan("Sistem Informasi");

        // Menampilkan data setelah diubah
        System.out.println("\n=== Data Mahasiswa Setelah Diubah ===");
        mhs.tampilData();
    }
}
