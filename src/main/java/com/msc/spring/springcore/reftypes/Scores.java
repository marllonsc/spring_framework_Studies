package com.msc.spring.springcore.reftypes;

public class Scores {

    private Double maths;
    private Double physics;
    private Double chemistry;

    public Scores(){}

    public Scores(Double maths, Double physics, Double chemistry) {
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public Double getMaths() {
        return maths;
    }

    public Double getPhysics() {
        return physics;
    }

    public Double getChemistry() {
        return chemistry;
    }

    public void setMaths(Double maths) {
        this.maths = maths;
    }

    public void setPhysics(Double physics) {
        this.physics = physics;
    }

    public void setChemistry(Double chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "maths=" + maths +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                '}';
    }
}
