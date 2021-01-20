package com.company.practice.command;

public class LookTargetCommand implements Command {
    Cannon cannon;

    public LookTargetCommand(Cannon cannon) {
        this.cannon = cannon;
    }

    @Override
    public void execute() {
        cannon.lookTarget();
    }
}
