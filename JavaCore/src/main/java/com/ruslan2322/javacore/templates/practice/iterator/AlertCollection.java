package com.company.practice.iterator;

public class AlertCollection implements CollectionSet {

    static final int MAX_ALERTS = 8;
    int numberOfAlerts = 0;
    Alert[] alertList;

    public AlertCollection() {

    }

    public void addAlert(String str){
        Alert alert = new Alert(str);
        if (numberOfAlerts >= MAX_ALERTS)
            System.err.println("COMPLETED");
    else {
        alertList[numberOfAlerts] = alert;
        numberOfAlerts = numberOfAlerts + 1;
    }
    }
    @Override
    public Iterator createIterator(){
        return new AlertIterator(alertList);
    }
}
