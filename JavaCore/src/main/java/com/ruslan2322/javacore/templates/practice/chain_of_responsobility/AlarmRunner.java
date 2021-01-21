package com.company.practice.chain_of_responsibility;

public class AlarmRunner {
    public static void main(String[] args) {

        Alarm alarm1 = new NoAlarm(Priority.IsOK);
        Alarm alarm2 = new SoftAlarm(Priority.ATTENTION);
        Alarm alarm3 = new DangerAlarm(Priority.FAILURE);


        // В общем задача следующая , если поступает ATTENTION 10 раз и
        // не никакой реакции, то приоритет меняется на FAILURE, в общем это надо обсудить при созвоне
        alarm1.setNextAlarm(alarm2);

        alarm2.setNextAlarm(alarm3);
    }
}
