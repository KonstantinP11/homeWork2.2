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
}
