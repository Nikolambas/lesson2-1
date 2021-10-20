package com.company;

import java.util.ArrayList;

public class Team {
    private String teamName = "Витязи";
    Object [] team = new Object[4];

    public void setTeam(Object[] team) {
        this.team = team;
    }

    public Object[] getTeam() {
        return team;
    }

    public Team(Object obj1, Object obj2, Object obj3, Object obj4) {
        team[0]=obj1;
        team[1]=obj2;
        team[2]=obj3;
        team[3]=obj4;
    }

    public void printTeam(Object [] team){
        System.out.println("Команда "+ teamName+":");
        for (int i = 0; i < team.length; i++) {
            if (team[i] instanceof Man){
                System.out.println("Человек");
            }
            if (team[i] instanceof Robot){
                System.out.println("Робот");
            }
            if (team[i] instanceof Cat){
                System.out.println("Кошка");
            }
        }
    }

    public void showResults(){
        System.out.println("Смогли пройти полосу препятствий:");
        for (int i = 0; i < team.length; i++) {
            if (team[i] instanceof Man) {
                System.out.println("Человек");
            }
            if (team[i] instanceof Robot) {
                System.out.println("Робот");
            }
            if (team[i] instanceof Cat) {
                System.out.println("Кошка");
            }
        }
    }
}
