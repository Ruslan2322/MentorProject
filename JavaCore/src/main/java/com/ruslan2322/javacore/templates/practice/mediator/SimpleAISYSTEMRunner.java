package com.company.practice.mediator;

public class SimpleAISYSTEMRunner {
    public static void main(String[] args) {
        SimpleMonitoringSistem simpleMonitoringSistem = new SimpleMonitoringSistem();
        Systems automaticAI = new AutomaticAI(simpleMonitoringSistem,"AI");
        Systems freezerSystem = new FreezerSystem(simpleMonitoringSistem,"CRACK1");
        Systems freezerSystem1 = new FreezerSystem(simpleMonitoringSistem,"CRACK2");

        simpleMonitoringSistem.setAdmin(automaticAI);
        simpleMonitoringSistem.addUserToChat(freezerSystem);
        simpleMonitoringSistem.addUserToChat(freezerSystem1);

        freezerSystem.sendMessage("income temperature is too high...plz do something");
        automaticAI.sendMessage("Problem identification. Switching on CRACK number 2.");

    }
}
