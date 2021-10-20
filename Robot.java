package com.company;

public class Robot implements Jumpable,Runnable{
    private String name = "Робот";

    public String getName() {
        return name;
    }

    private int jump = 2;
    private int run = 200;

    @Override
    public boolean jump() {
        if (jump>new Wall().getHeight()) {
            System.out.println("Робот перепрыгнул");
            return true;
        }
        System.out.println("Робот не перепрыгнул");
        return false;
    }

    @Override
    public boolean run() {
        if (run>new Treadmill().getLength()) {
            System.out.println("Робот пробежал");
            return true;
        }
        System.out.println("Робот не пробежал");
        return false;
    }
}
