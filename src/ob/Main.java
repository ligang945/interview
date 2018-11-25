package ob;

public class Main {
    public static void main(String[] args) {
        ISubscriber subscriberA = new SubscriberA();
        ISubscriber subscriberB = new SubscriberB();

        Publisher publisher = new Publisher();
        publisher.add(subscriberA);
        publisher.add(subscriberB);

        publisher.update();
    }
}
