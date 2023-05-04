package AprilAssessment;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Condo extends Property implements RentalIncome {
    private int numberOfFloors;
    private final String amenities= "Pool, Gym";


    @Override
    public double calculateRentalIncome() {
        return getRentPerMonth()*12;
    }
}
