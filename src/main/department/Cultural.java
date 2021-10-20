package main.department;


import main.member.Interest;
import main.member.Members;

import java.util.List;

public class Cultural extends Department {
    public Cultural(String nameDepartment, List<Members> listMembers) {
        super(nameDepartment, listMembers);
    }

    @Override
    public boolean addMemberToDepartment(Members member) {
        Interest interestOfMember = member.getPrincipalInterest();
        boolean isActive = member.getCheckActiveMember();
        if ((interestOfMember.equals(Interest.getInterestValue("muzica"))) ||((interestOfMember.equals(Interest.getInterestValue("socializare"))))) {
            System.out.println("Volunteer ,"+member.getNameMember()+",  match with the Cultural department");
         return super.addMemberToDepartment(member);
        }
        else{
            //System.out.println("Volunteer ,"+member.getNameMember()+",  doesen't match with the Cultural department");
            return false;
        }
    }

}


