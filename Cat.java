package com.company;

public class Cat implements Jumpable,Runnable{
    private String name = "Кот";

    public String getName() {
        return name;
    }

    private int jump = 6;
    private int run = 6000;
    @Override
    public boolean jump() {
        if (jump>new Wall().getHeight()) {
            System.out.println("Кот перепрыгнул");
            return true;
        }
        System.out.println("Кот не перепрыгнул");
        return false;
    }

    @Override
    public boolean run() {
        if (run>new Treadmill().getLength()) {
            System.out.println("Кот пробежал");
            return true;
        }
        System.out.println("Кот не пробежал");
        return false;
    }
}
