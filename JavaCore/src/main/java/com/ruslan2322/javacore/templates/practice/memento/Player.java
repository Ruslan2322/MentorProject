package com.company.practice.memento;

public class Player implements IOriginator{

    private int heath;

    public Player() {
        this.heath = 100;
    }

    public  void  getHurt(int hurt){
        heath -= hurt;
    }

    public void getCure(int cure){
        heath += cure;
        System.out.println("Health was curing");
    }

    public void PrintPulse(){
        if (heath > 70)
            System.out.println("Health = Green");
        if (heath <= 70 && heath > 40)
            System.out.println("Health = Yellow");
        if (heath <= 40)
            System.out.println("Health = Red");
    }

    @Override
    public Memento getMemento() {
        return new Memento(heath);
    }

    @Override
    public void setMemento(Memento memento) {
        heath = memento.getState();

    }
}
