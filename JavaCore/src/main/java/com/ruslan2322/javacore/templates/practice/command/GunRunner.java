package com.company.practice.command;

/**
 * Симулятор ПВО
 * */

public class GunRunner {
    public static void main(String[] args) {

        Cannon cannon = new Cannon(15 + (int) (Math.random() * 7));
        Enemy enemy = new Enemy(10 + (int) (Math.random() * 5), 1);

        System.out.println(enemy.toString());
        System.out.println(cannon.toString());

        AutomaticAI ai = new AutomaticAI(new LoadCommand(cannon), new LookTargetCommand(cannon), new HitCommand(cannon), new ClearCommand(cannon));

        System.out.println("Our radar see something...");
        fight(cannon,enemy);


    }

    private static void fight(Cannon cannon, Enemy enemy) {

        if (enemy.enemyRadar == 1) {
            System.out.println("Enemy detecting...");
            int charges = 100;
            int shoots = 0;

            while (shoots <= charges) {
                cannon.loadCannon();
                cannon.lookTarget();
                cannon.hitTarget(cannon,enemy);
                cannon.clearCannon();

                if (enemy.hitpoints <= 0) {
                    System.out.println("Victory! Enemy destroy;");
                    shoots = charges;
                    break;
                }
                if (shoots == 99){
                    System.out.println("Ammunition is empty...");
                } else {
                    System.out.println("The enemy is not defeated, repeat the operation...");
                }
                shoots++;
            }
        }
    }
}

