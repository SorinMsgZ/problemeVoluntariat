package main.department;


import main.member.Interest;
import main.member.Member;


public class Cultural extends Department {

    public Cultural(String nameDepartment) {
        super(nameDepartment);
    }

    @Override
    public boolean addMember(Member member) {
        Interest interestOfMember = member.getPrincipalInterest();

        if ((interestOfMember.equals(Interest.MUZICA)) ||
                ((interestOfMember.equals(Interest.SOCIALIZARE)))) {
            return super.addMember(member);
        } else {
            return false;
        }
    }

}


