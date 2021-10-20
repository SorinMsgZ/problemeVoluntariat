package main.member;

public enum Interest {
    TEHNOLOGIE("tehnologie"), REPREZENTARE("reprezentare"), MUZICA("muzica"), SOCIALIZARE("socializare");

    private String interest;

    Interest(String interest) {
        this.interest = interest;
    }

    public String getTypeInterest() {
        return interest;
    }

    public static Interest getInterestValue(String interestTag) {
        for (Interest interestsValue : Interest.values()) {
            if (interestsValue.getTypeInterest().equals(interestTag)) {
                return interestsValue;
            }
        }
        throw new RuntimeException("Interest Value is not supported");
    }


}