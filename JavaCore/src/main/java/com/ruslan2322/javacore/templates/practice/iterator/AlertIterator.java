package com.company.practice.iterator;

public class AlertIterator implements Iterator {

    Alert[] alertList;
    int position = 0;

    public AlertIterator(Alert[] alertList) {
        this.alertList = alertList;
    }

    public Object next() {
        Alert alert = this.alertList[this.position];
        ++this.position;
        return alert;
    }

    public boolean hasNext() {
        return this.position < this.alertList.length && this.alertList[this.position] != null;
    }
}
