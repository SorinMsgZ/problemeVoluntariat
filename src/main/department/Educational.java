package main.department;


import main.member.Interest;
import main.member.Members;

import java.util.List;

public class Educational extends Department {
    public Educational(String nameDepartment, List<Members> listMembers) {
        super(nameDepartment, listMembers);
    }

    @Override
    public boolean addMemberToDepartment(Members member) {
        Interest interestOfMember = member.getPrincipalInterest();
        boolean checkIfActive = member.getCheckActiveMember();
      /*  if ((interestOfMember.equals("reprezentare")) && (checkIfActive == true)) {
            super.addMemberToDepartment(member);
        }*/

          if ((interestOfMember.equals(Interest.getInterestValue("reprezentare"))) && (checkIfActive)) {
              System.out.println("Volunteer ,"+member.getNameMember()+", match with the Educational department");
           return super.addMemberToDepartment(member);
        }
          else{
              //System.out.println("Volunteer ,"+member.getNameMember()+", doesen't match with the Educational department");
              return false;
          }
    }

}
