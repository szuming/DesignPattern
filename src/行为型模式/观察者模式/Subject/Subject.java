package 行为型模式.观察者模式.Subject;

import 行为型模式.观察者模式.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
