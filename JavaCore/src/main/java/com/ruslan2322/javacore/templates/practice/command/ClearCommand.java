package com.company.practice.command;

public class ClearCommand implements Command {
    Cannon cannon;

    public ClearCommand(Cannon cannon) {
        this.cannon = cannon;
    }

    @Override
    public void execute() {
        cannon.clearCannon();
    }
}
