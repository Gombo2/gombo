package org.example.memberservice.domain;

public class Member {
    private final int id;
    private final String name;
    private final int age;
    private final String ihidnum;
    private final String phoneNumber;
    private final String email;
    private final String password;
    private final String nickname;
    private final byte status; // tinyint -> byte enum될듯?
    private final int reportedCount;
    private final byte userGrant;

    // 생성자
    public Member(int id, String name, int age, String ihidnum, String phoneNumber, String email,
                  String password, String nickname, byte status, int reportedCount, byte userGrant) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ihidnum = ihidnum;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.status = status;
        this.reportedCount = reportedCount;
        this.userGrant = userGrant;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIhidnum() {
        return ihidnum;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public byte getStatus() {
        return status;
    }

    public int getReportedCount() {
        return reportedCount;
    }

    public byte getUserGrant() {
        return userGrant;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", ihidnum='" + ihidnum + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", status=" + status +
                ", reportedCount=" + reportedCount +
                ", userGrant=" + userGrant +
                '}';
    }
}