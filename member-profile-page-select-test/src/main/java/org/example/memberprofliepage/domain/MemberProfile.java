package org.example.memberprofliepage.domain;

import java.util.Map;

public class MemberProfile {
    private int id;
    private int exp;
    private int level;
    private String introduce;
    private String preferredArea;
    private String gitAddress;
    private int score;
    private String isPofileimage;
    private int memberId;

    public MemberProfile() {
    }

    public MemberProfile(int id, int exp, int level, String introduce, String preferredArea, String gitAddress, int score, String isPofileimage, int memberId) {
        this.id = id;
        this.exp = exp;
        this.level = level;
        this.introduce = introduce;
        this.preferredArea = preferredArea;
        this.gitAddress = gitAddress;
        this.score = score;
        this.isPofileimage = isPofileimage;
        this.memberId = memberId;
    }

    public int getId() {
        return id;
    }

    public int getExp() {
        return exp;
    }

    public int getLevel() {
        return level;
    }

    public String getIntroduce() {
        return introduce;
    }

    public String getPreferredArea() {
        return preferredArea;
    }

    public String getGitAddress() {
        return gitAddress;
    }

    public int getScore() {
        return score;
    }

    public String getIsPofileimage() {
        return isPofileimage;
    }

    public int getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return "MemberProfile{" +
                "id=" + id +
                ", exp=" + exp +
                ", level=" + level +
                ", introduce='" + introduce + '\'' +
                ", preferredArea='" + preferredArea + '\'' +
                ", gitAddress='" + gitAddress + '\'' +
                ", score=" + score +
                ", isPofileimage='" + isPofileimage + '\'' +
                ", memberId=" + memberId +
                '}';
    }
}
