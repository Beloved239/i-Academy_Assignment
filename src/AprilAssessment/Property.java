package AprilAssessment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Property {
    private String propertyType;
    private String location;
    private double bedrooms;
    private double bathrooms;
    private double rentPerMonth;
    private boolean occupiedStatus;

    public int getId() {

        return (int) rentPerMonth;
    }

//    public String addProperty() {
//        return null;
//    }
//    public abstract String addProperty();

}
