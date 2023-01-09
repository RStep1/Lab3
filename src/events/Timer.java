package events;

public class Timer {
    public static void delay(int minutes) {
        if (minutes == 0) {
            System.out.print("Тут же ");
        } else {
            System.out.println("Прошло ровно " + minutes + " минута");
        }
    }
}
