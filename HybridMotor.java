public class HybridMotor extends Motor implements Electric, GPSable {

    public HybridMotor(String merek) {
        super(merek);
    }

    @Override
    public void chargeBattery() {
        System.out.println("Motor Hybrid " + merek + " sedang mengisi baterai...");
    }

    @Override
    public void useGPS() {
        System.out.println("Motor Hybrid " + merek + " menggunakan GPS untuk navigasi.");
    }
}
