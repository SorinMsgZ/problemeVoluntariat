package main.department;


import main.member.Members;

import java.util.List;

public abstract class Department {
    protected String nameDepartment;
    protected static final int NR_MAX_VOLUNTEER = 10;
    protected List<Members> listMembers;

    public Department(String nameDepartment, List<Members> listMembers) {
        this.nameDepartment = nameDepartment;
        this.listMembers = listMembers;
    }

    public boolean addMemberToDepartment(Members member) {
        int actualSize = listMembers.size();
        if (actualSize < NR_MAX_VOLUNTEER) {
            listMembers.add(member);
            return true;
        } else if (actualSize == NR_MAX_VOLUNTEER) {
            System.out.println("Department completed. No place for additional members");
            return false;
        } else {
            System.out.println("Too many volunteers!");
            return false;
        }
    }

    public List<Members> getListMembers() {
        return listMembers;
    }

    public static int getNrMaxVolunteer() {
        return NR_MAX_VOLUNTEER;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nameDepartment='" + nameDepartment + '\'' +
                ", listMembers=" + listMembers +
                '}';
    }
}

