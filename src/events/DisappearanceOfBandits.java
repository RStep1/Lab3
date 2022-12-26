package events;


import entities.persons.Bandit;

public class DisappearanceOfBandits {
    public static void simulateEvent() {
        Bandit korovyev = new Bandit("Коровьев");
        Bandit beghemoth = new Bandit("Бегемот");
        korovyev.hopOff();
        beghemoth.hopOff();
        korovyev.burst();
        beghemoth.burst();
    }
}
