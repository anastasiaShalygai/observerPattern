package observerPattern.observer;

import observerPattern.Observer;
import observerPattern.Subject;

import java.util.logging.Logger;


/**
 * Created by Anastasiya on 28.03.2017.
 */
public class WorkerB implements Observer {
    private static Logger log = Logger.getLogger(WorkerB.class.getName());
    private Subject shopData;
    private String promotions;
    private String novelties;

    public WorkerB(Subject shopData) {
        this.shopData = shopData;
        //redurant action - leads to infinite assignment values to object
        shopData.registerObserver(this);
    }

    @Override
    public void update(String promotions, String novelties) {
        this.promotions = promotions;
        this.novelties = novelties;
        log.info("WorkerB \n"  + promotions + "\n" + novelties + "\n");
    }
}
