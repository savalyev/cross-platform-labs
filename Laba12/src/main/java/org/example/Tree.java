package org.example;

public class Tree extends Plant {

    private int crownDiameter;

    public int getCrownDiameter() {
        return crownDiameter;
    }

    public void setCrownDiameter(int crownDiameter) {
        this.crownDiameter = crownDiameter;
    }

    public Tree(String name, int id, int height, int crownDiameter) {
        super(name, id, height);
        this.crownDiameter = crownDiameter;
    }

    @Override
    public String toString() {
        return super.toString().concat(". Диаметр ствола: " + this.crownDiameter);
    }
}
