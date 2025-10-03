public class BeatSport extends Beat {

    public BeatSport(String merek) {
        super(merek);
    }

    public void sportMode() {
        System.out.println("Motor Beat Sport " + this.merek + " menggunakan mode sport!");
    }
}
