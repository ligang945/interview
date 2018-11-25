package ob;

public class SubscriberA implements ISubscriber{
    @Override
    public void update() {
        System.out.println("A updated");
    }
}
