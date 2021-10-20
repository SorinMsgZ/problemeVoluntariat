package main.department;


import main.member.Interest;
import main.member.Members;

import java.util.List;

public class IT extends Department {

    public IT(String nameDepartment, List<Members> listMembers) {
        super(nameDepartment, listMembers);
    }

    @Override
    public boolean addMemberToDepartment(Members member) {
        Interest interestOfMember = member.getPrincipalInterest();

        if (interestOfMember.equals(Interest.getInterestValue("tehnologie"))) {
            System.out.println("Volunteer  ,"+member.getNameMember()+",  match with the IT department");
          return super.addMemberToDepartment(member);
        }
        else{
            //System.out.println("Volunteer  ,"+member.getNameMember()+", doesen't match with the IT department");
            return false;
        }
    }
}
