package com.company.practice.observer;




// Этот класс управляет добавлением, удалением и осведомлением всех подписчиков
 public interface Subject {
    public void register(Observer o);

    public void unregister(Observer o);

    public void notifyAllObservers(String s);
}

