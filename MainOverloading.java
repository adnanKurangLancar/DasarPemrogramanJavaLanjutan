// Class Matematika untuk demonstrasi Method Overloading
class Matematika {
    // Method 1: Menjumlahkan dua bilangan integer
    public int tambah(int a, int b) {
        return a + b;
    }

    // Method 2: Menjumlahkan tiga bilangan integer
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Menjumlahkan dua bilangan double
    public double tambah(double a, double b) {
        return a + b;
    }
}

// Kelas utama (main)
public class MainOverloading {
    public static void main(String[] args) {
        Matematika m = new Matematika();

        System.out.println("Tambah 2 int: " + m.tambah(5, 10));       // Memanggil method 1
        System.out.println("Tambah 3 int: " + m.tambah(2, 4, 6));     // Memanggil method 2
        System.out.println("Tambah 2 double: " + m.tambah(2.5, 3.5)); // Memanggil method 3
    }
}
