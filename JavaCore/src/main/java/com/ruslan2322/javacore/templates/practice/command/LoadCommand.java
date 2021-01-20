package com.company.practice.command;

public class LoadCommand implements Command {
    Cannon cannon;

    public LoadCommand(Cannon cannon) {
        this.cannon = cannon;
    }

    @Override
    public void execute() {
        cannon.loadCannon();
    }
}
