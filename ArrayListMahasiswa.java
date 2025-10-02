import java.util.ArrayList; // Import ArrayList dari package java.util

public class ArrayListMahasiswa {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan nama mahasiswa
        ArrayList<String> mahasiswa = new ArrayList<>();

        // Menambahkan data ke ArrayList
        mahasiswa.add("Adnan");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");
        mahasiswa.add("Dewi");

        // Menampilkan isi ArrayList
        System.out.println("=== Daftar Mahasiswa (ArrayList) ===");
        for(String mhs : mahasiswa) {
            System.out.println("- " + mhs);
        }
    }
}
