package main;

import main.department.Cultural;
import main.department.Department;
import main.department.Educational;
import main.department.IT;
import main.member.Members;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public List<Department> listDepartmentsOfOrganisation;

    public Main() {

        //initializare voluntari
        Members voluntar1 = new Members("Alex", 23, "tehnologie", true);
        Members voluntar2 = new Members("Ghita", 24, "reprezentare", true);
        Members voluntar3 = new Members("Elena", 35, "reprezentare", false);
        Members voluntar4 = new Members("Raluca", 18, "muzica", true);
        Members voluntar5 = new Members("Iri", 55, "socializare", true);
        Members voluntar6 = new Members("Bob", 65, "tehnologie", true);

        // creare lista voluntari
        List<Members> listTestVolunteers = new ArrayList<>();
        listTestVolunteers.add(voluntar1);
        listTestVolunteers.add(voluntar2);
        listTestVolunteers.add(voluntar3);
        listTestVolunteers.add(voluntar4);
        listTestVolunteers.add(voluntar5);
        listTestVolunteers.add(voluntar6);

        //initializare 3 posibile Departamente

        List<Members> listMemberDep1 = new ArrayList<>();
        List<Members> listMemberDep2 = new ArrayList<>();
        List<Members> listMemberDep3 = new ArrayList<>();
       /* listMemberDep1=null;
        listMemberDep2=null;
        listMemberDep3=null;
        */
        Department department1 = new IT("IT-Insurance", listMemberDep1);
        Department department2 = new Educational("Educational-Edu", listMemberDep2);
        Department department3 = new Cultural("Cultural-Cool", listMemberDep3);

        //filtrare voluntari si adaugare membrii corespunzatori pe departamente
        for (Members volunteer : listTestVolunteers) {

            if (department1.addMemberToDepartment(volunteer)) {

            } else if (department2.addMemberToDepartment(volunteer)) {

            } else if (department3.addMemberToDepartment(volunteer)) {

            } else {
                System.out.println(
                        "!!!< " + volunteer.getNameMember() + ">" + " doesn't match with any of the departments");
            }
        }

        //initializare organizatie si adaugare departamente in organizatie
        System.out.println("");
        System.out.println("1.Adaugare departamente in organizatie");
        listDepartmentsOfOrganisation = new ArrayList<>();

        Organisation volunteerOrg = new Organisation("Volunteering", listDepartmentsOfOrganisation);
        volunteerOrg.addDepartment(department1);
        volunteerOrg.addDepartment(department2);
        volunteerOrg.addDepartment(department3);

        //1.listeaza membrii unui departament din organizatie
        System.out.println("");
        System.out.println("2.Listeaza membrii unui departament din organizatie");
        volunteerOrg.listingMembersOfTheDepartment(department1);

        //2.listeaza cati membrii mai trebuie pt a se completa departamentele
        System.out.println("");
        System.out.println("3.Listeaza cati membrii mai trebuie pt a se completa departamentele");
        volunteerOrg.nbMembersToCompleteDepartment(department1);
        volunteerOrg.nbMembersToCompleteDepartment(department2);
        volunteerOrg.nbMembersToCompleteDepartment(department2);

        //3.sterge un departament
        System.out.println("");
        System.out.println("4.Sterge un departament");
        volunteerOrg.deleteDepartement(department3);
    }

    public static void main(String[] args) {
        //testing:
        // 6 volunteers
        // 3 departments

        Main testVolunteers = new Main();
    }
}
