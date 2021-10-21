package main;

import main.department.Cultural;
import main.department.Department;
import main.department.Educational;
import main.department.IT;
import main.member.Member;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public Main() {

        //1.initializare organizatie si adaugare departamente in organizatie
        System.out.println("");
        System.out.println("1.Adaugare departamente in organizatie");
        Organisation volunteerOrgX = new Organisation("Volunteering");

        Department depIT = new IT("IT");
        Department depEdu = new Educational("Educational");
        Department depCult = new Cultural("Cultural");

        volunteerOrgX.addDepartment(depIT);
        System.out.println(("IT Department added: "));
        System.out.println(volunteerOrgX.getDepartments());

        volunteerOrgX.addDepartment(depEdu);
        System.out.println(("Educational Department added: "));
        System.out.println(volunteerOrgX.getDepartments());

        volunteerOrgX.addDepartment(depCult);
        System.out.println(("Cultural Department added: "));
        System.out.println(volunteerOrgX.getDepartments());

        //initializare voluntari
        Member voluntar1 = new Member("Alex", 23, "TEHNOLOGIE", true);
        Member voluntar2 = new Member("Ghita", 24, "REPREZENTARE", true);
        Member voluntar3 = new Member("Elena", 35, "REPREZENTARE", false);
        Member voluntar4 = new Member("Raluca", 18, "MUZICA", true);
        Member voluntar5 = new Member("Iri", 55, "SOCIALIZARE", true);
        Member voluntar6 = new Member("Bob", 65, "TEHNOLOGIE", true);

        // creare lista voluntari
        List<Member> listTestVolunteers = new ArrayList<>();
        listTestVolunteers.add(voluntar1);
        listTestVolunteers.add(voluntar2);
        listTestVolunteers.add(voluntar3);
        listTestVolunteers.add(voluntar4);
        listTestVolunteers.add(voluntar5);
        listTestVolunteers.add(voluntar6);


        //filtrare voluntari si adaugare membrii corespunzatori pe departamente
        for (Member volunteer : listTestVolunteers) {
            for (Department departmentOfOrg : volunteerOrgX.getDepartments()) {
                departmentOfOrg.addMember(volunteer);
            }
        }

        //2.listeaza membrii unui departament din organizatie
        System.out.println("");
        System.out.println("2.Listeaza membrii unui departament din organizatie");
        System.out.println(volunteerOrgX.listingMembersOfTheDepartment("IT"));

        //3.listeaza cati membrii mai trebuie pt a se completa departamentele

        int restIT = volunteerOrgX.nbMembersToCompleteDepartment("IT");
        int restEdu = volunteerOrgX.nbMembersToCompleteDepartment("Educational");
        int restCult = volunteerOrgX.nbMembersToCompleteDepartment("Cultural");
        System.out.println("");
        System.out.println("3.Listeaza cati membrii mai trebuie pt a se completa departamentele");
        System.out.println("IT: " + restIT);
        System.out.println("Educational: " + restEdu);
        System.out.println("Cultural: " + restCult);

        //4.sterge un departament
        System.out.println("");
        System.out.println("4.Sterge un departament");
        volunteerOrgX.deleteDepartement("IT");
        System.out.println("The remaining departments after delete: ");
        System.out.println(volunteerOrgX.getDepartments());
    }

    public static void main(String[] args) {
        //testing:
        // 6 volunteers
        // 3 departments

        Main testVolunteers = new Main();
    }
}
