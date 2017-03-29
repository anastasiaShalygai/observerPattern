package observerPattern;

import java.util.ArrayList;

/**
 * Created by Anastasiya on 28.03.2017.
 */
public class CompanyData implements Subject {
    //it is better to notify compiler, that observers object would store multiple objects with Observer type
    private ArrayList observers;
    private String promotions;
    private String novelties;

    public CompanyData() {
        observers = new ArrayList();
    }

    //In your case of implementation - this method is never used at all.
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
        //better to replace with foreach loop - will save memory space - would no create additional vars
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
