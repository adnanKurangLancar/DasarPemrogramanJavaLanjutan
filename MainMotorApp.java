public class MainMotorApp {
    public static void main(String[] args) {

        System.out.println("=== Single Inheritance ===");
        Beat beat = new Beat("Honda");
        beat.melaju();

        System.out.println("\n=== Hierarchical Inheritance ===");
        Supra supra = new Supra("Honda");
        supra.melaju();

        System.out.println("\n=== Multilevel Inheritance ===");
        BeatSport bs = new BeatSport("Honda");
        bs.melaju();
        bs.sportMode();

        System.out.println("\n=== Hybrid Inheritance ===");
        HybridMotor hm = new HybridMotor("Yamaha");
        hm.melaju();
        hm.chargeBattery();
        hm.useGPS();
    }
}
