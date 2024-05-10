package event;

import java.util.ArrayList;
import java.util.List;

public class EndOfSprintEventPublisher {
    private final List<Subscriber> subscriberList = new ArrayList<>();
    public EndOfSprintEventPublisher() {
        System.out.println("Вызван конструктор класса EndOfSprintEventPublisher");
    }
    public void subscribe(Subscriber subscriber) {
        System.out.println("Вызван метод subscribe класса EndOfSprintEventPublisher");
        subscriberList.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber) {
        System.out.println("Вызван метод unsubscribe класса EndOfSprintEventPublisher");
        subscriberList.remove(subscriber);
    }
    public void notifySubscribers() {
        System.out.println("Вызван метод notifySubscribers класса EndOfSprintEventPublisher");
        for (Subscriber subscriber : subscriberList)
            subscriber.update();
    }
}