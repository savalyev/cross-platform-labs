package org.example;

public class Shrub extends Plant {

    private int branchCount;

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public Shrub(String name, int id, int height, int branchCount) {
        super(name, id, height);
        this.branchCount = branchCount;
    }

    @Override
    public String toString() {
        return super.toString().concat(". Количество ветвей: " + this.branchCount);
    }
}
