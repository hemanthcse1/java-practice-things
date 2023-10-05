package com.hemanth.javathings.java8features.methodreference;

public class StudentDTO {

    private int id;
    private String name;
    private int grade;
    private int score;

    public StudentDTO() {
    }

    public StudentDTO(int id, String name, int grade, int score) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.score = score;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }
}
