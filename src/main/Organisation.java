package main;

import main.department.Cultural;
import main.department.Department;
import main.department.Educational;
import main.department.IT;
import main.member.Member;


import java.util.ArrayList;
import java.util.List;

public class Organisation {
    private String name;
    private List<Department> departments;

    public Organisation(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public Department lookForDepartment(String departmentTarget) {
        Department theDepartment = null;
        for (Department availableDepartments : departments) {
            if (availableDepartments.getName().equals(departmentTarget)) {
                theDepartment = availableDepartments;
            }

        }
        return theDepartment;
    }

    public void deleteDepartement(String departmentTarget) {
        Department departmentToDelete = lookForDepartment(departmentTarget);
        if (departmentToDelete != null)
            departments.remove(departmentToDelete);
    }

    public List<Member> listingMembersOfTheDepartment(String departmentTarget) {
        Department findDepartment = lookForDepartment(departmentTarget);
        return findDepartment.getMembers();
    }

    public int nbMembersToCompleteDepartment(String departmentTarget) {
        Department findDepartment = lookForDepartment(departmentTarget);

        int actualNbOfMembers = findDepartment.getMembers().size();
        int nbToComplete;
        if (actualNbOfMembers < Department.getNrMaxVolunteer()) {
            nbToComplete = Department.getNrMaxVolunteer() - actualNbOfMembers;
            return nbToComplete;
        } else {
            return 0;
        }
    }
}
