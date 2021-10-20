package main;

import main.department.Department;
import main.member.Members;


import java.util.List;

public class Organisation {
    private String nameOfOrganisation;
    private List<Department> listOfDepartments;

    public Organisation(String nameOfOrganisation, List<Department> listOfDepartments) {
        this.nameOfOrganisation = nameOfOrganisation;
        this.listOfDepartments = listOfDepartments;
    }

    public void addDepartment(Department department) {
        listOfDepartments.add(department);
    }

    public void setListOfDepartments(List<Department> listOfDepartments) {
        this.listOfDepartments = listOfDepartments;
    }

    public void deleteDepartement(Department department) {
        System.out.println("#The available departments are: ");
        for (Department departmentList : listOfDepartments) {
            System.out.println(departmentList);
        }
        listOfDepartments.remove(department);
        System.out.println("#The department ," + department + ", has been deleted");
        System.out.println("#Rest of departments still avaiabele: ");
        for (Department departmentList : listOfDepartments) {
            System.out.println(departmentList);
        }

    }

    public void listingMembersOfTheDepartment(Department department) {
        System.out.println("The members of department ," + department.getNameDepartment() + ", are: ");
        System.out.println(department.getListMembers());

    }

    public void nbMembersToCompleteDepartment(Department department) {

        int actualNbOfMembers = department.getListMembers().size();
        int nbToComplete;
        if (actualNbOfMembers < Department.getNrMaxVolunteer()) {
            nbToComplete = Department.getNrMaxVolunteer() - actualNbOfMembers;
            System.out.println("Check if departments are complete -> return: The free places for other members");
            System.out.println(department.getNameDepartment() + ": " + nbToComplete);
        } else {
            throw new RuntimeException("No place for other members. Size of department completetd!");
        }
    }
}
