public class Hogwarts {
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

    public int getConjure() {
        return conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    Gryffindor harry = new Gryffindor("Harry Potter", 30, 30, 40, 30, 50);
    Gryffindor hermione = new Gryffindor("Hermione Grangerr", 35, 20, 30, 50, 50);
    Gryffindor ron = new Gryffindor("Ron Weasley", 20, 10, 20, 20, 20);
    Puffenduy zacharias = new Puffenduy("Zacharias Smith", 10, 10, 10, 10, 10);
    Puffenduy cedric = new Puffenduy("Cedric Diggory", 20, 20, 20, 20, 20);
    Puffenduy justin = new Puffenduy("Justin Finch-Fletchley", 30, 00, 30, 30, 10);
    Kogtevran zhou = new Kogtevran("Zhou Chang", 10, 10, 20, 20, 10, 10);
    Kogtevran padma = new Kogtevran("Padma Patil", 20, 30, 20, 10, 10, 20);
    Kogtevran marcus = new Kogtevran("Marcus Belby", 20, 20, 20, 20, 15, 15);
    Slytherin draco = new Slytherin("Draco Malfoy", 30, 20, 20, 20, 30, 25, 10);
    Slytherin graham = new Slytherin("Graham Montague", 15, 15, 15, 15, 15, 15, 15);
    Slytherin gregory = new Slytherin("Gregory Goyle", 9, 9, 9, 9, 9, 9, 9);

}
