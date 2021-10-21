package main.department;


import main.member.Interest;
import main.member.Member;


public class Educational extends Department {

    public Educational(String nameDepartment) {
        super(nameDepartment);
    }

    @Override
    public boolean addMember(Member member) {
        Interest interestOfMember = member.getPrincipalInterest();
        boolean checkIfActive = member.getCheckActiveMember();

        if ((interestOfMember.equals(Interest.REPREZENTARE)) && (checkIfActive)) {
            return super.addMember(member);
        } else {
            return false;
        }
    }

}
