public class Motor {

    protected String merek; // atribut: merek motor (protected agar subclass bisa mengakses)

    public Motor(String merek) {
        this.merek = merek; 
    }

    public void melaju() {
        System.out.println("Motor " + this.merek + " melaju");
    }
}
