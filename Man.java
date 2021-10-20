package com.company;

public class Man implements Jumpable,Runnable{
    private String name = "Человек";

    public String getName() {
        return name;
    }

    private int jump = 1;
    private int run =4000;
    @Override
    public boolean jump() {
        if (jump > new Wall().getHeight()) {
            System.out.println("Человек перепрыгнул");
            return true;
        }
        System.out.println("Человек не перепрыгнул");
        return false;
    }

    @Override
    public boolean run() {
        if (run>new Treadmill().getLength()) {
            System.out.println("Человек пробежал");
            return true;
        }
        System.out.println("Человек не пробежал");
        return false;
    }
}
