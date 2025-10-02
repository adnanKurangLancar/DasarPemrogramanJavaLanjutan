public class ArrayMahasiswa {
    public static void main(String[] args) {
        // Membuat array berisi nama mahasiswa
        String[] mahasiswa = {"Adnan", "Budi", "Citra", "Dewi"};

        // Menampilkan isi array
        System.out.println("=== Daftar Mahasiswa (Array) ===");
        for(int i = 0; i < mahasiswa.length; i++) {
            System.out.println((i+1) + ". " + mahasiswa[i]);
        }
    }
}
