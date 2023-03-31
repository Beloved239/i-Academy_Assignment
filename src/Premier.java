public class Premier {
    public static void main(String[] args) {
        Club arsenal = new Club();
        Club manchesterUnited = new Club();
        Club manchesterCity = new Club();
        Club liverpool = new Club();
        Club blackpool = new Club();

        System.out.println("Displaying First Club Information ");


        arsenal.setClubName("Arsenal");
        arsenal.setClubCoach("Mikel Ateta");
        arsenal.setClubCaptain("Martin Odegaard");
        arsenal.setClubStadium("Emirates Stadium");

        arsenal.displayMessage();

        System.out.println();

        System.out.println("Displaying Second Club Information ");

        manchesterUnited.setClubName("Manchester United");
        manchesterUnited.setClubCoach("Erik Ten Hag");
        manchesterUnited.setClubCaptain("Harry Maguire");
        manchesterUnited.setClubStadium("Old Trafford");

        manchesterUnited.displayMessage();
        System.out.println();

        System.out.println("Displaying Third Club Information ");

        manchesterCity.setClubName("Manchester City");
        manchesterCity.setClubCoach("Pep Guardiola");
        manchesterCity.setClubCaptain("IIkay Gundogan");
        manchesterCity.setClubStadium("Etihad Stadium");

        manchesterCity.displayMessage();
        System.out.println();

        System.out.println("Displaying Forth Club Information ");

        liverpool.setClubName("Liverpool");
        liverpool.setClubCoach("Jurgen Klopp");
        liverpool.setClubCaptain("Jordan Henderson");
        liverpool.setClubStadium("Anfield");

        liverpool.displayMessage();
        System.out.println();

        System.out.println("Displaying Fifth Club Information ");

        blackpool.setClubName("Blackpool");
        blackpool.setClubCoach("Mick McCarthy");
        blackpool.setClubCaptain("Marvin Ekpiteta");
        blackpool.setClubStadium("Bloomfield Road");

        blackpool.displayMessage();

    }
}
