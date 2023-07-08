public class Kogtevran extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Kogtevran(String name, int conjure, int transgress, int smart, int wise, int witty, int creative) {
        super(name, conjure, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    @Override
    public String toString() {
        return super.toString() + ", Kogtevran: " +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative;
    }
}
