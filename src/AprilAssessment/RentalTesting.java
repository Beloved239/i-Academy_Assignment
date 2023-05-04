package AprilAssessment;

public class RentalTesting {
    public static void main(String[] args) {
        RentalRepository rentalRepository = new RentalRepository(12);
        Property property = null;
        rentalRepository.addProperty(null);
        rentalRepository.deleteProperty(1);
        rentalRepository.getPropertyById("Apartment");
        rentalRepository.updateProperty(null);
        System.out.println(rentalRepository.toString());
        Apartment apartment = new Apartment();
//        apartment.get

    }
}
