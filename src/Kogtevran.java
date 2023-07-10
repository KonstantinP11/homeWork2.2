public class Kogtevran extends Hogwarts {
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

    @Override
    public String toString() {
        return super.toString() + ", Kogtevran: " +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative;
    }

    public void compareTo(Kogtevran other) {
        int sumThis = this.smart + this.wise + this.witty + this.creative;
        int sumOther = other.smart + other.wise + other.witty + other.creative;
        if (sumThis > sumOther) {
            printResultCompare(this, other);
        } else if (sumOther > sumThis) {
            printResultCompare(other, this);
        } else {
            System.out.println("Студенты " + this.getName() + " и " + other.getName() + " одинаково сильны");
        }
    }

    private void printResultCompare(Kogtevran bestStudent, Kogtevran worstStudent) {
        System.out.println(bestStudent.getName() + " лучший Когтевранец, чем " + worstStudent.getName());
    }
}
