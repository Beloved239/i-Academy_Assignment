public class Club {
    private String clubName;
    private String clubCaptain;
    private String clubCoach;
    private String clubStadium;

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubCaptain() {
        return clubCaptain;
    }

    public void setClubCaptain(String clubCaptain) {
        this.clubCaptain = clubCaptain;
    }

    public String getClubCoach() {
        return clubCoach;
    }

    public void setClubCoach(String clubCoach) {
        this.clubCoach = clubCoach;
    }

    public String getClubStadium() {
        return clubStadium;
    }

    public void setClubStadium(String clubStadium) {
        this.clubStadium = clubStadium;
    }

    public void displayMessage() {
        System.out.printf("Club name is %s\nClub Coach is %s\nClub Captain is %s\nClub Stadium is %s\n"
                , getClubName(), getClubCoach(), getClubCaptain(), getClubStadium());
    }
}