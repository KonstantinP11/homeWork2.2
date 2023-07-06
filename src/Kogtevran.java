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
}
