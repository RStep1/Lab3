package entities.persons.croud_of_people;

public class PoliceOfficers extends People {
    private final int NUMBER;
    public PoliceOfficers(String name, int NUMBER) {
        super(name);
        this.NUMBER = NUMBER;
    }

    public int getNUMBER(int NUMBER) {
        return NUMBER;
    }

    public void runningThrough(Croud croud) {
        System.out.println(this.getName() + "бегут сковзь " + croud.getName() + "\n");
    }
}
