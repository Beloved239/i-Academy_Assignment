package AprilAssessment;

public class PropertyCode {
        private static int lastApartmentCode;
        private static int lastHouseCode;
        private static int lastCondoCode;

        public static String generatePropertyCode(String propertyType) {
            String codePrefix = "";
            int lastCode = 0;

            switch (propertyType) {
                case "Apartment" -> {
                    codePrefix = "APA";
                    lastCode = lastApartmentCode;
                }
                case "House" -> {
                    codePrefix = "HOU";
                    lastCode = lastHouseCode;
                }
                case "Condo" -> {
                    codePrefix = "CON";
                    lastCode = lastCondoCode;
                }
                default -> throw new IllegalArgumentException("Invalid property type: " + propertyType);
            }

            String codeSuffix = String.format("%04d", lastCode + 1);
            String propertyCode = codePrefix + codeSuffix;

            switch (propertyType) {
                case "Apartment" -> lastApartmentCode++;
                case "House" -> lastHouseCode++;
                case "Condo" -> lastCondoCode++;
            }

            return propertyCode;
        }

    public static void main(String[] args) {
        String apartmentCode1 = PropertyCode.generatePropertyCode("Apartment");
        String apartmentCode2 = PropertyCode.generatePropertyCode("Apartment");
        String houseCode1 = PropertyCode.generatePropertyCode("House");
        String houseCode2 = PropertyCode.generatePropertyCode("House");
        String condoCode1 = PropertyCode.generatePropertyCode("Condo");
        String condoCode2 = PropertyCode.generatePropertyCode("Condo");

        System.out.println(apartmentCode1); // Output: APA0001
        System.out.println(apartmentCode2); // Output: APA0002
        System.out.println(houseCode1); // Output: HOU0001
        System.out.println(houseCode2); // Output: HOU0001
        System.out.println(condoCode1); // Output: CON0001
        System.out.println(condoCode2); // Output: CON0001
    }

}



