package ob;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Publisher {
    private LinkedHashSet<ISubscriber> list = new LinkedHashSet<>();

    public void add(ISubscriber s) {
        list.add(s);
    }

    public void changed(){
        System.out.println("publisher changed");
        notifyObservers();
    }

    public void notifyObservers() {
        list.forEach(ISubscriber::update);
    }
}
