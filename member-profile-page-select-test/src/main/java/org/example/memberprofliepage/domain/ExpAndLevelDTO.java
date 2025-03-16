package org.example.memberprofliepage.domain;

public class ExpAndLevelDTO {
    private int exp;
    private int level;

    public ExpAndLevelDTO() {
    }

    public ExpAndLevelDTO(int exp, int level) {
        this.exp = exp;
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public int getLevel() {
        return level;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "ExpAndLevelDTO{" +
                "exp=" + exp +
                ", level=" + level +
                '}';
    }
}
