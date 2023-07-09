public class Puffenduy extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffenduy(String name, int conjure, int transgress, int hardworking, int loyal, int honest) {
        super(name, conjure, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return super.toString() + ", Puffenduy: " +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest;
    }

    public void compareTo(Puffenduy other) {
        int sumThis = this.hardworking + this.honest + this.loyal;
        int sumOther = other.hardworking + other.honest + other.loyal;
        if (sumThis > sumOther) {
            printResultCompare(this, other);
        } else if (sumOther > sumThis) {
            printResultCompare(this, other);
        } else {
            System.out.println("Студенты " + this.getName() + " и " + other.getName() + " одинаково сильны");
        }
    }

    private void printResultCompare(Puffenduy bestStudent, Puffenduy worstStudent) {
        System.out.println(bestStudent.getName() + " лучший Пуффендуйец, чем " + worstStudent.getName());
    }
}
