public class Supra extends Motor {

    public Supra(String merek) {
        super(merek);
    }

    @Override
    public void melaju() {
        System.out.println("Motor Supra " + this.merek + " melaju dengan stabil!");
    }
}
