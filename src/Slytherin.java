public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int conjure, int transgress, int cunning,
                     int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, conjure, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + ", Slytherin: " +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower;
    }

    public void compareTo(Slytherin other) {
        int sumThis = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int sumOther = other.cunning + other.determination + other.ambition + other.resourcefulness + other.lustForPower;
        if (sumThis > sumOther) {
            printResultCompare(this, other);
        } else if (sumOther > sumThis) {
            printResultCompare(this, other);
        } else {
            System.out.println("Студенты " + this.getName() + " и " + other.getName() + " одинаково сильны");
        }
    }

    private void printResultCompare(Slytherin bestStudent, Slytherin worstStudent) {
        System.out.println(bestStudent.getName() + " лучший Слизеринец, чем " + worstStudent.getName());
    }
}
