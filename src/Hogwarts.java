public abstract class Hogwarts {
    private String name;
    private int conjure;
    private int transgress;

    public Hogwarts(String name, int conjure, int transgress) {
        this.name = name;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", conjure=" + conjure +
                ", transgress=" + transgress;
    }

    public void compareToHogwarts(Hogwarts other) {
        int sumThis = this.conjure + this.transgress;
        int sumOther = other.conjure + other.transgress;
        if (sumThis > sumOther) {
            printResultCompare(this, other);
        } else if (sumOther > sumThis) {
            printResultCompare(this, other);
        } else {
            System.out.println("Студенты " + this.name + " и " + other.name + " обладают одинаковой мощностью магии");
        }
    }

    private void printResultCompare(Hogwarts bestStudent, Hogwarts worstStudent) {
        System.out.println(bestStudent.getName() + " обладает бОльшей мощностью магии, чем " + worstStudent.getName());
    }
}