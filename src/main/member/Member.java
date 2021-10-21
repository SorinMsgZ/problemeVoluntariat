package main.member;

public class Member {
    private String name;
    private int age;
    private Interest principalInterest;
    private boolean activeMember;

    public Member(String name, int age, String interest, boolean activeMember) {
        this.name = name;
        this.age = age;
        this.principalInterest = Interest.valueOf(interest);
        this.activeMember = activeMember;
    }

    public Interest getPrincipalInterest() {
        return principalInterest;
    }

    public boolean getCheckActiveMember() {
        return activeMember;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Members{" +
                "name='" + name +
                '}';
    }
}

