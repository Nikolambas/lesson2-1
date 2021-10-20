package com.company;


public class Course {
    Object [] courses = new Object[2];

    public Object[] getCourses() {
        return courses;
    }

    public Course(Object course1,Object course2) {
        courses[0] = course1;
        courses[1] = course2;
    }

    public void dolt(Team team) {
        for (int i = 0; i < team.getTeam().length; i++) {
            for (int j = 0; j < courses.length; j++) {
                if (courses[j].equals(team.getTeam()[i])) {
                    continue;
                }
                team.getTeam()[i]=null;
                break;
            }
        }
    }
}
