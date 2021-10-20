package com.company;

public class Wall {
    private int height=3;

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Jumpable){
            return ((Jumpable) obj).jump();
        }
        System.out.println("Обьект не умеет прыгать");
        return false;
    }
}
