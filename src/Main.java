
import entities.persons.Emotions;
import entities.persons.Porter;
import events.ShortSound;
import events.Sounds;
import entities.persons.Bandit;
import locations.*;

public class Main {
    public static void main(String[] args) {

        /*
        String a = "asg4pa";
        String b = ";lajga;lj";
        String c = ";ija";
        List<String> strings = new ArrayList<String>();
        strings.add(a);
        strings.add(b);
        strings.add(c);
        strings.add("90uighiuhf");
        strings.forEach(str -> System.out.println(str.length() + " "  + str));
        strings.sort((String s1, String s2) -> s1.length() - s2.length());
        System.out.println();
        strings.forEach(str -> System.out.println(str.length() + " "  + str));
        */


        /*ShortSound.playSound(Sounds.WHISTLING);

        Emotions e1 = Emotions.EXCITED;
        Emotions e2 = Emotions.SHOCKED;
        System.out.println(e1.toString() + " " + e2.toString());


        Porter p = new Porter("porter");
        System.out.println(p.getEmotion().toString());

        Bandit bandit = new Bandit("Korovyev");
        System.out.println(bandit.getName());

        IPlace location = new Place("name");*/


        Place torgsin = new Place("торгсин");
        Place smolensky = new Place("Смоленский");
        torgsin.addSubplaces(smolensky);
        System.out.println(torgsin);
        System.out.println(smolensky.getSuperplace());

    }
}