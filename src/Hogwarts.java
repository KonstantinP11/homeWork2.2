public class Hogwarts {
    private String name;
    private int conjure;
    private int transgress;

    public Hogwarts(String name, int conjure, int transgress) {
        this.name = name;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    static Gryffindor[] gryffindors = new Gryffindor[]{
            new Gryffindor("Harry Potter", 30, 30, 40, 30, 50),
            new Gryffindor("Hermione Grangerr", 35, 20, 30, 50, 50),
            new Gryffindor("Ron Weasley", 20, 10, 20, 20, 20)
    };
    static Puffenduy[] puffenduys = new Puffenduy[]{
            new Puffenduy("Zacharias Smith", 10, 10, 10, 10, 10),
            new Puffenduy("Cedric Diggory", 20, 20, 20, 20, 20),
            new Puffenduy("Justin Finch-Fletchley", 30, 20, 30, 30, 10)
    };
    static Kogtevran[] kogtevran = new Kogtevran[]{
            new Kogtevran("Zhou Chang", 10, 10, 20, 20, 10, 10),
            new Kogtevran("Padma Patil", 20, 30, 20, 10, 10, 20),
            new Kogtevran("Marcus Belby", 20, 20, 20, 20, 15, 15)
    };
    static Slytherin[] slytherin = new Slytherin[]{
            new Slytherin("Draco Malfoy", 30, 20, 20, 20, 30, 25, 10),
            new Slytherin("Graham Montague", 15, 15, 15, 15, 15, 15, 15),
            new Slytherin("Gregory Goyle", 9, 9, 9, 9, 9, 9, 9)
    };

    public String getName() {
        return name;
    }

    public int getConjure() {
        return conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", conjure=" + conjure +
                ", transgress=" + transgress;
    }

    public static void printStudent(String name) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor s = gryffindors[i];
            if (name == s.getName()) {
                System.out.println(gryffindors[i]);
                return;
            }
        }
        for (int i = 0; i < puffenduys.length; i++) {
            Puffenduy s = puffenduys[i];
            if (name == s.getName()) {
                System.out.println(puffenduys[i]);
                return;
            }
        }
        for (int i = 0; i < kogtevran.length; i++) {
            Kogtevran s = kogtevran[i];
            if (name == s.getName()) {
                System.out.println(kogtevran[i]);
                return;
            }
        }
        for (int i = 0; i < slytherin.length; i++) {
            Slytherin s = slytherin[i];
            if (name == s.getName()) {
                System.out.println(slytherin[i]);
            }
        }
    }

    public static void lookBestGryffindor(String student1, String student2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor s = gryffindors[i];
            if (s.getName() == student1) {
                sum1 = s.getNobility() + s.getHonor() + s.getCourage();
            }
            if (s.getName() == student2) {
                sum2 = s.getNobility() + s.getHonor() + s.getCourage();
            }
        }
        if (sum1 > sum2) {
            System.out.println(student1 + " лучший Гриффиндорец, чем " + student2);
        } else
            System.out.println(student2 + " лучший Гриффиндорец, чем " + student1);
    }

    public static void lookBestPuffenduy(String student1, String student2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < puffenduys.length; i++) {
            Puffenduy s = puffenduys[i];
            if (s.getName() == student1) {
                sum1 = s.getHardworking() + s.getLoyal() + s.getHonest();
            }
            if (s.getName() == student2) {
                sum2 = s.getHardworking() + s.getLoyal() + s.getHonest();
            }
        }
        if (sum1 > sum2) {
            System.out.println(student1 + " лучший Пуффендуйец, чем " + student2);
        } else
            System.out.println(student2 + " лучший Пуффендуйец, чем " + student1);
    }

    public static void lookBestHogwarts(String student1, String student2) {
        int conjure1 = 0;
        int transgres1 = 0;
        int conjure2 = 0;
        int transgres2 = 0;
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor s = gryffindors[i];
            if (student1 == s.getName()) {
                conjure1 = s.getConjure();
                transgres1 = s.getTransgress();
            }
            if (student2 == s.getName()) {
                conjure2 = s.getConjure();
                transgres2 = s.getTransgress();
            }
        }
        for (int i = 0; i < puffenduys.length; i++) {
            Puffenduy s = puffenduys[i];
            if (student1 == s.getName()) {
                conjure1 = s.getConjure();
                transgres1 = s.getTransgress();
            }
            if (student2 == s.getName()) {
                conjure2 = s.getConjure();
                transgres2 = s.getTransgress();
            }
        }
        for (int i = 0; i < kogtevran.length; i++) {
            Kogtevran s = kogtevran[i];
            if (student1 == s.getName()) {
                conjure1 = s.getConjure();
                transgres1 = s.getTransgress();
            }
            if (student2 == s.getName()) {
                conjure2 = s.getConjure();
                transgres2 = s.getTransgress();
            }
        }
        for (int i = 0; i < slytherin.length; i++) {
            Slytherin s = slytherin[i];
            if (student1 == s.getName()) {
                conjure1 = s.getConjure();
                transgres1 = s.getTransgress();
            }
            if (student2 == s.getName()) {
                conjure2 = s.getConjure();
                transgres2 = s.getTransgress();
            }
        }
        if (conjure1 > conjure2) {
            System.out.println(student1 + " обладает бОльшей мощностью магии, чем " + student2);
        } else
            System.out.println(student2 + " обладает бОльшей мощностью магии, чем " + student1);
        if (transgres1 > transgres2) {
            System.out.println(student1 + " обладает бОльшей мощностью трансгрессии, чем " + student2);
        } else
            System.out.println(student2 + " обладает бОльшей мощностью трансгрессии, чем " + student1);
    }
}
