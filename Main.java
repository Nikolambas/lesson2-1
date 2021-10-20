package com.company;

import java.util.ArrayList;

public class Main {

   public static void main(String[] args) {
        Team team = new Team(new Robot(),new Cat(),new Man(),new Robot());
        Course course = new Course(new Treadmill(),new Wall());
        team.printTeam(team.getTeam());
        course.dolt(team);
        team.showResults();
    }
}
