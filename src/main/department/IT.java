package main.department;


import main.member.Interest;
import main.member.Member;


public class IT extends Department {

    public IT(String nameDepartment) {
        super(nameDepartment);
    }

    @Override
    public boolean addMember(Member member) {
        Interest interestOfMember = member.getPrincipalInterest();

        if (interestOfMember.equals(Interest.TEHNOLOGIE)) {
            return super.addMember(member);
        } else {
            return false;
        }
    }
}
