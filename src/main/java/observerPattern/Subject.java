package observerPattern;

/**
 * Created by Anastasiya on 28.03.2017.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
