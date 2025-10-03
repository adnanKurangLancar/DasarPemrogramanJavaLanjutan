// Superclass Hewan
class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

// Subclass Anjing
class Anjing extends Hewan {
    // Overriding method bersuara()
    @Override
    public void bersuara() {
        System.out.println("Guk Guk!");
    }
}

// Subclass Kucing
class Kucing extends Hewan {
    // Overriding method bersuara()
    @Override
    public void bersuara() {
        System.out.println("Meong!");
    }
}

// Kelas utama (main)
public class MainOverriding {
    public static void main(String[] args) {
        Hewan h1 = new Anjing(); // Objek anjing, tapi referensi Hewan
        Hewan h2 = new Kucing(); // Objek kucing, tapi referensi Hewan

        h1.bersuara(); // Output: Guk Guk! (mengikuti objek Anjing)
        h2.bersuara(); // Output: Meong! (mengikuti objek Kucing)
    }
}