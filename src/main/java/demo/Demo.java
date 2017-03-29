package demo;

import observerPattern.*;
import observerPattern.observer.*;

import static util.CompanyDataConstants.*;

/**
 * Created by Anastasiya on 28.03.2017.
 */
public class Demo {

    public static void main(String[] args) {
        CompanyData companyData = new CompanyData();

        WorkerA workerA = new WorkerA(companyData);
        WorkerB workerB = new WorkerB(companyData);
        WorkerC workerC = new WorkerC(companyData);

        companyData.setData(promotionsDay1, noveltiesDay1);
        companyData.removeObserver(workerB);
        companyData.setData(promotionsDay2, noveltiesDay2);
    }
}
