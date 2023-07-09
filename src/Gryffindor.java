public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int conjure, int transgress, int nobility, int honor, int courage) {
        super(name, conjure, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gryffindor: " +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage;
    }

    public void compareTo(Gryffindor other) {
        int sumThis = this.nobility + this.honor + this.courage;
        int sumOther = other.nobility + other.honor + other.courage;
        if (sumThis > sumOther) {
            printResultCompare(this, other);
        } else if (sumOther > sumThis) {
            printResultCompare(this, other);
        } else {
            System.out.println("Студенты " + this.getName() + " и " + other.getName() + " одинаково сильны");
        }
    }

    private void printResultCompare(Gryffindor bestStudent, Gryffindor worstStudent) {
        System.out.println(bestStudent.getName() + " лучший Гриффиндорец, чем " + worstStudent.getName());
    }
}
