package AprilAssessment;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class House extends Property implements RentalIncome {
    private int numberOfFloors;
    private int yardSize;


    @Override
    public double calculateRentalIncome() {
        return getRentPerMonth()*12;
    }
}
