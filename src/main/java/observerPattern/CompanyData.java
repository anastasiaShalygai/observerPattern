package observerPattern;

import java.util.ArrayList;

/**
 * Created by Anastasiya on 28.03.2017.
 */
public class CompanyData implements Subject {
    private ArrayList observers;
    private String promotions;
    private String novelties;

    public CompanyData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(promotions, novelties);
        }
    }

    public void setData(String promotions, String novelties) {
        this.promotions = promotions;
        this.novelties = novelties;
        notifyObservers();
    }

}
