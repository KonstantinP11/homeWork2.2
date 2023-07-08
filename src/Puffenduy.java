public class Puffenduy extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffenduy(String name, int conjure, int transgress, int hardworking, int loyal, int honest) {
        super(name, conjure, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return super.toString() + ", Puffenduy: " +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest;
    }
}
