import java.util.HashMap; // Import HashMap dari package java.util

public class HashMapMahasiswa {
    public static void main(String[] args) {
        // Membuat HashMap dengan key = NIM, value = Nama
        HashMap<String, String> mahasiswa = new HashMap<>();

        // Menambahkan data mahasiswa
        mahasiswa.put("23123456", "Adnan");
        mahasiswa.put("23123457", "Budi");
        mahasiswa.put("23123458", "Citra");

        // Menampilkan isi HashMap
        System.out.println("=== Daftar Mahasiswa (HashMap) ===");
        for(String nim : mahasiswa.keySet()) {
            System.out.println("NIM: " + nim + " | Nama: " + mahasiswa.get(nim));
        }
    }
}
