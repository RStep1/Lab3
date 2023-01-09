import entities.persons.*;
import entities.persons.croud_of_people.*;
import entities.things.*;
import events.Timer;
import locations.*;

public class Main {
    public static void main(String[] args) {
        Place smolensky = new Place("Смоленский");
        Place torgsin = new Place("торгсин");
        GlassDoor backDoor = new GlassDoor("двери черного хода", false);
        Stall confactionaryStall = new Stall("кондитерский прилавок");
        Stall fishStall = new Stall("рыбный прилавок");
        Place house = new Place("дом Грибоедовской тетки");
        Place boulevardSidewalk = new Place("тротуар бульвара");

        Thing curtains = new Thing("полотняные шторы");
        Windows windows = new Windows("окна", curtains);

        torgsin.addSubplaces(confactionaryStall, fishStall,
                backDoor, windows); //
        smolensky.addSubplaces(torgsin); //

        Thing fruit = new Thing("фрукты");
        Thing paperTapes = new Thing("красивые бумажные ленты");
        Basket baskets = new Basket("корзинки", fruit, paperTapes);
        confactionaryStall.addThingsOn(baskets);//

        Thing salmon = new Thing("семга");
        fishStall.addThingsOn(salmon);//

        Bandit korovyev = new Bandit("Коровьев");
        Bandit behemoth = new Bandit("Бегемот");
        torgsin.addEntities(korovyev, behemoth); //

        Thing hat = new Thing("шляпа");
        Thing chocolateTower = new Thing("остатки погубленной " +
                 behemoth + "ом шоколадной эйфелевой башни");
        Tray tray = new Tray("поднос", chocolateTower);
        torgsin.addEntities(hat, chocolateTower, tray); //

        Foreigner foreigner = new Foreigner("сиреневый гражданин",
                Emotions.UNDEFINED, hat, tray);
        fishStall.addEntities(foreigner); //

        korovyev.snatch(tray, Hand.RIGHT_HAND, foreigner);
        korovyev.dropThing(tray);
        korovyev.snatch(hat, Hand.LEFT_HAND, foreigner);

        korovyev.hit(Hand.RIGHT_HAND, foreigner, "по плешивой голове");

        korovyev.setInLeftHand(null);
        korovyev.setInRightHand(null);


        System.out.println();
        foreigner.setEmotion(Emotions.TURNS_WHITE);
        foreigner.fallBackward();
        System.out.print(" и ");
        Thing herring = new Thing("сельдь");
        Tub tub = new Tub("кадка", herring);
        fishStall.addEntities(tub, herring);//
        foreigner.fallInto(tub);

        Timer.delay(0);
        System.out.println("стряслось и вторе чудо.");
        foreigner.setEmotion(Emotions.SHOCKED);
        foreigner.scream("-Убивают! Милицию! Меня бандиты убивают!\n",
                "на чистом русском языке");

        Person person = new Person("Павел Иосифович");
        confactionaryStall.addEntities(person);
        Porter porter = new Porter("швейцар");
        torgsin.addEntities(porter); //
        porter.finishWhistle();
        System.out.print(" и ");

        Croud buyers = new Croud("толпы покупателей", Emotions.EXCITED);
        PoliceOfficers policeOfficers = new PoliceOfficers("милицейские", 2);
        torgsin.addEntities(buyers, policeOfficers); //
        policeOfficers.runningThrough(buyers);

        Liquid petrol = new Liquid("бензин", true);
        Tank primus = new Tank("примус", petrol);
        behemoth.setInRightHand(primus);
        behemoth.douseWith(confactionaryStall, primus);


        System.out.print(" и ");
        confactionaryStall.inflame("сам собой, ");

        Croud salesgirls = new Croud("продавщицы");
        confactionaryStall.addEntities(salesgirls); //
        salesgirls.scream();
        salesgirls.runTo(confactionaryStall, torgsin);
        Timer.delay(0);
        windows.getCurtains().inflame(" на " + windows);

        Croud audience = new Croud("публика", Emotions.DESPERATE);
        confactionaryStall.addEntities(audience); //
        audience.scream();
        audience.runTo(confactionaryStall, torgsin);
        System.out.print(" и ");
        audience.crash(person);

        People sellers = new People("продавцы");
        fishStall.addEntities(sellers);
        sellers.runTo(fishStall, backDoor);

        foreigner.getOutOf(tub);
        foreigner.climbOver(fishStall);
        System.out.print(" и ");
        foreigner.runTo(fishStall, backDoor);

        torgsin.removeEntity(porter);
        torgsin.removeEntity(policeOfficers);
        torgsin.removeEntity(salesgirls);
        torgsin.removeEntity(audience);
        backDoor.removeEntity(sellers);
        backDoor.removeEntity(foreigner);
        Croud allPeople = new Croud("люди");
        backDoor.addEntities(allPeople);
        allPeople.dislodge(backDoor);
        allPeople.runTo(backDoor, smolensky);

        korovyev.disappear(torgsin);
        behemoth.disappear(torgsin);

        System.out.println();
        Witnesses witnesses = new Witnesses("очевидцы", "при пожаре", torgsin);
        smolensky.addEntities(witnesses);
        witnesses.tellEvent();
        System.out.println();

        Timer.delay(1);
        korovyev.appear(boulevardSidewalk);
        behemoth.appear(boulevardSidewalk);
        System.out.println("Как раз напротив " + house);
    }
}