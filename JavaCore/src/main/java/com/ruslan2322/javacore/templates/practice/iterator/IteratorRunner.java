package com.company.practice.iterator;

public class IteratorRunner {
    public IteratorRunner() {
    }

        public static void main(String[] args) {
            AlertCollection alertCollection = new AlertCollection();
            AlertBar alertBar = new AlertBar(alertCollection);
            alertBar.printAlerts();
        }
    }
