package AprilAssessment;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
public class Apartment extends Property implements RentalIncome{

    private double floorNumber;


    @Override
    public double calculateRentalIncome() {
        return getRentPerMonth()*12;
    }


}
