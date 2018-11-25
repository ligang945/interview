package ob;

public class SubscriberB implements ISubscriber {
    @Override
    public void update() {
        System.out.println("B updated");
    }
}
