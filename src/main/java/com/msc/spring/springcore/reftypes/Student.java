package com.msc.spring.springcore.reftypes;

public class Student {

    private Scores scores;

    public Student(){};

    public Student(Scores scores) {
        this.scores = scores;
    }

    public Scores getScores() {
        return scores;
    }

    public void setScores(Scores scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "scores=" + scores +
                '}';
    }
}
