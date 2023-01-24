import entities.persons.*;
import entities.persons.croud_of_people.*;
import entities.things.*;
import events.Timer;
import exceptions.IncorrectNumberOfPeopleException;
import locations.*;

public class Main {
    public static void main(String[] args) throws IncorrectNumberOfPeopleException {
        var regent = new Person("бывший регент") {
            public void twistingMouth(Emotions emotion) {
                setEmotion(emotion);
                System.out.println("кривя рот ");
            }
            @Override
            public void shout(String phrase, String condition) {
                System.out.print(phrase + ", - " + condition + "орал " + this + ", ");
            }
        };

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
                backDoor, windows);
        smolensky.addSubplaces(torgsin);

        Thing fruit = new Thing("фрукты");
        Thing paperTapes = new Thing("красивые бумажные ленты");
        Basket baskets = new Basket("корзинки", fruit, paperTapes);
        confactionaryStall.addThingsOn(baskets);

        Thing salmon = new Thing("семга");
        fishStall.addThingsOn(salmon);

        Bandit korovyev = new Bandit("Коровьев");
        Bandit behemoth = new Bandit("Бегемот");
        torgsin.addEntities(korovyev, behemoth, regent);

        Thing hat = new Thing("шляпа");
        Thing chocolateTower = new Thing("остатки погубленной " +
                 behemoth + "ом шоколадной эйфелевой башни");
        Tray tray = new Tray("поднос", chocolateTower);
        torgsin.addEntities(hat, chocolateTower, tray);

        Foreigner foreigner = new Foreigner("сиреневый гражданин", Emotions.UNDEFINED,
                "в парадном сиреневом костюме, от лососины весь распух, он весь набит валютой", hat, tray);
        fishStall.addEntities(foreigner);

        var boss = new Person("Павел Иосифович") {
            public void shudder(Emotions emotion) {
                setEmotion(emotion);
                System.out.println("содрагаться");
            }
        };
        OldMan oldMan = new OldMan("старичок", "приличнейший, тихий, одетый бедно, но чистенько ");
        confactionaryStall.addEntities(boss, oldMan);

        Croud audience = new Croud("публика", Emotions.UNDEFINED);
        torgsin.addEntities(audience);

        Porter porter = new Porter("швейцар");
        torgsin.addEntities(porter);



        System.out.print(korovyev + " продолжал: ");
        korovyev.say("-Откуда? -задаю я всем вопрос! Ну, ");
        Thing mandarin = new Thing("мандарин");
        confactionaryStall.addThingsOn(mandarin);
        behemoth.take(mandarin, confactionaryStall);
        korovyev.say("И вся-то цена этому мандарину три копейки. И вот ");
        porter.startWhistle();
        System.out.println();
        korovyev.say("А ему можно? А? - ");
        Timer.delay(0);
        korovyev.pointTo(foreigner);
        System.out.print("От чего у него на лице выразилась сильнейшая ");
        foreigner.setEmotion(Emotions.ANXIETY);
        System.out.println();
        korovyev.say("-кто он такой? А? Откуда он приехал? Зачем?" +
                " Скучали мы, что ли, без него? Приглашали мы его, что ли?\n");
        regent.shout("Конечно", "во весь голос ");
        regent.twistingMouth(Emotions.SARCASTICALLY);
        korovyev.say("-он, видите ли, " + foreigner.getDescription() + ",\n" +
                "а нашему-то?! ");
        korovyev.shout("Горько мне! Горько! Горько!", "как шафер на старинной свадьбе");


        System.out.print("Все это заставило " + boss + " ");
        boss.shudder(Emotions.ANGRILY);
        audience.setEmotion(Emotions.SYMPATHY);
        System.out.println("Но, как это ни странно, по глазам столпившейся " + audience +
                "видно было, что в них она вызавала " + audience.getEmotion());
        System.out.println("Когда ");
        behemoth.shout("– Спасибо, верный друг, заступился за пострадавшего!", "трагически");
        System.out.println("-произошло чудо\n");


        System.out.println(oldMan + " " + oldMan.getDescription());
        System.out.print(oldMan + " ");
        Thing cakes = new Thing("три миндальных пироженых");
        confactionaryStall.addThingsOn(cakes);
        oldMan.buying(cakes, confactionaryStall);
        System.out.print(", ");;
        oldMan.changeСharacter();
        oldMan.flung("на пол и ");
        oldMan.shout("-Правда!", "детским тонким голосом");
        System.out.println();




        oldMan.snatch(tray, Hand.RIGHT_HAND, foreigner);
        oldMan.dropThing(tray);
        oldMan.snatch(hat, Hand.LEFT_HAND, foreigner);

        oldMan.hit(Hand.RIGHT_HAND, foreigner, "по плешивой голове");


        System.out.println();
        foreigner.setEmotion(Emotions.TURNS_WHITE);
        foreigner.fallBackward();
        System.out.print(" и ");
        Thing herring = new Thing("сельдь");
        Tub tub = new Tub("кадка", herring);
        fishStall.addEntities(tub, herring);
        foreigner.fallInto(tub);

        Timer.delay(0);
        System.out.println("стряслось и вторе чудо.");
        foreigner.setEmotion(Emotions.SHOCKED);
        foreigner.shout("-Убивают! Милицию! Меня бандиты убивают!\n",
                "на чистом русском языке");


        porter.finishWhistle();
        System.out.print(" и ");

        Croud buyers = new Croud("толпы покупателей", Emotions.EXCITED);
        PoliceOfficers policeOfficers = new PoliceOfficers("милицейские", 2);
        torgsin.addEntities(buyers, policeOfficers);
        policeOfficers.runningThrough(buyers);

        Liquid petrol = new Liquid("бензин", true);
        Tank primus = new Tank("примус", petrol);
        behemoth.addItems(primus);
        behemoth.douseWith(confactionaryStall, primus);


        System.out.print(" и ");
        confactionaryStall.inflame("сам собой, ");

        Croud salesgirls = new Croud("продавщицы");
        confactionaryStall.addEntities(salesgirls);
        salesgirls.scream();
        salesgirls.runTo(confactionaryStall, torgsin);
        Timer.delay(0);
        windows.getCurtains().inflame(" на " + windows);

        torgsin.removeEntity(audience);
        confactionaryStall.addEntities(audience);
        audience.setEmotion(Emotions.DESPERATE);

        audience.scream();
        audience.runTo(confactionaryStall, torgsin);
        System.out.print(" и ");
        audience.crash(boss);

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