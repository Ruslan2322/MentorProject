package com.company.practice.command;

public class HitCommand implements Command {
    Cannon cannon;
    Enemy enemy;

    public HitCommand(Cannon cannon) {
        this.cannon = cannon;
    }

    @Override
    public void execute() {
        cannon.hitTarget(cannon,enemy);
    }
}
