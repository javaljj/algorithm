package designmodel.观察者;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    public void add(Observer observer) {
        observerList.add(observer);
    }

    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyAll(String message) {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(message);
        }

    }
}
