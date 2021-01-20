package com.company.practice.command;

public class AutomaticAI {
    Command load;
    Command lookTarget;
    Command hit;
    Command clearWeapon;

    public AutomaticAI(Command load, Command lookTarget, Command hit, Command clearWeapon) {
        this.load = load;
        this.lookTarget = lookTarget;
        this.hit = hit;
        this.clearWeapon = clearWeapon;
    }

    public void loadWeapon(){
        load.execute();
    }

    public void lookForTaret(){
        lookTarget.execute();
    }

    public void hitTarget(){
        hit.execute();
    }

    public void clearWeapon(){
        clearWeapon.execute();
    }
}
