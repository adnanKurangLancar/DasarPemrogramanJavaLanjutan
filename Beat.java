public class Beat extends Motor {

    public Beat(String merek) {
        super(merek);
    }

    @Override
    public void melaju() {
        System.out.println("Motor Beat " + this.merek + " melaju dengan gesit!");
    }
}
