import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("adnan");
        daftarNama.add("cinta");
        daftarNama.add("azkia");

        for (String nama : daftarNama) {
            System.out.println(nama);
            
        }
    }
}
