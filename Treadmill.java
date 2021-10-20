package com.company;

public class Treadmill {
    private int length=250;

    public int getLength() {
        return length;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Runnable) {
            return((Runnable) obj).run();
        }
        System.out.println("Обьект не умеет бегать");
        return false;
    }
}
