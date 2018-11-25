package ob;

import java.util.LinkedHashSet;

public class Publisher {
    private LinkedHashSet<ISubscriber> list = new LinkedHashSet<>();

    public void add(ISubscriber s) {
        list.add(s);
    }

    public void update() {
        list.forEach(ISubscriber::update);
    }
}
