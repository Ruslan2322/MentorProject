package com.company.practice.memento;

/**
 * Базовая реализация лечения в компьютерной игре
 * */

public class GameplayRunner {
    public static void main(String[] args) throws InterruptedException {

        GameUtils gameUtils = new GameUtils();
        Player player = new Player();

        player.getHurt(20); // Нанесено урон 20
        player.getHurt(30); // Нанесено урон 30
        player.getHurt(20); // Нанесено урон 20
        player.PrintPulse(); // Печатаем пульс

        // Сохраняем состояние
        gameUtils.SaveState(player);

        player.getCure(30); // принимаем лекарство
        player.PrintPulse(); // печатаем пульс

        // Восстанавливаем состояние
        gameUtils.loadState(player);

        player.PrintPulse(); // печатаем пульс

        System.out.println();
    }
}
