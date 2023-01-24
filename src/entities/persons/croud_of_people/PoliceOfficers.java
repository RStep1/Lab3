package entities.persons.croud_of_people;

import exceptions.IncorrectNumberOfPeopleException;

public class PoliceOfficers extends People {
    private final int NUMBER;
    public PoliceOfficers(String name, int NUMBER) throws IncorrectNumberOfPeopleException {
        super(name);
        if (NUMBER >= 1) {
            this.NUMBER = NUMBER;
        }
        else {
            throw new IncorrectNumberOfPeopleException("Число полицейских меньше единицы");
        }
    }

    public int getNUMBER() {
        return NUMBER;
    }

    public void runningThrough(Croud croud) {
        System.out.println(getNUMBER() + " " + getName() +
                " бегут сковзь " + croud.getEmotion() +
                " " + croud.getName());
    }
}
