package main.member;

public class Members {
    private String nameMember;
    private int ageMember;
    private Interest principalInterest;
    private boolean activeMember;

    public Members(String nameMember, int ageMember, String givenInterest, boolean activeMember) {
        this.nameMember = nameMember;
        this.ageMember = ageMember;
        this.principalInterest = Interest.getInterestValue(givenInterest);
        this.activeMember = activeMember;
    }

    public Interest getPrincipalInterest() {
        return principalInterest;
    }

    public boolean getCheckActiveMember() {
        return activeMember;
    }

    public String getNameMember() {
        return nameMember;
    }

    @Override
    public String toString() {
        return "Members{" +
                "nameMember='" + nameMember +
                '}';
    }
}

