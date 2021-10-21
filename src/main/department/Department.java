package main.department;


import main.member.Member;

import java.util.ArrayList;
import java.util.List;

public abstract class Department {
    protected String name;
    protected static final int NR_MAX_VOLUNTEER = 10;
    protected List<Member> members;

    public Department(String name) {
        this.name = name;
        members = new ArrayList<>();
    }

    public boolean addMember(Member member) {

        int actualSize = members.size();
        if (actualSize < NR_MAX_VOLUNTEER) {
            members.add(member);
            return true;
        } else {
            return false;
        }
    }

    public List<Member> getMembers() {
        return members;
    }

    public static int getNrMaxVolunteer() {
        return NR_MAX_VOLUNTEER;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}

