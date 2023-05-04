package AprilAssessment;

import java.util.Objects;

public class RentalRepository {
    //methods for Rental Management System
/*
 *1. Add Record in Array
 */

        private final Property[] properties;
        private int size;
        Apartment apartment = new Apartment();


        public RentalRepository(int capacity) {
            this.properties = new Property[capacity];
            this.size = 0;
        }

        public void addProperty(Property property) {
            if (size >= properties.length) {
                throw new IllegalStateException("Repository is full.");
            }
            properties[size++] = property;
        }

        public Property[] getProperties() {
            Property[] result = new Property[size];
            System.arraycopy(properties, 0, result, 0, size);
            return result;
        }

        public Property getPropertyById(String id) {
            for (int i = 0; i < size; i++) {
                Property property = properties[i];
                if (Objects.equals(property.getPropertyType(), id)) {
                    return property;
                }
            }
            return null;
        }

        public void updateProperty(Property updatedProperty) {
            for (int i = 0; i < size; i++) {
                Property property = properties[i];
                if (property.getId() == updatedProperty.getId()) {
                    properties[i] = updatedProperty;
                    break;
                }
            }
        }

        public void deleteProperty(int id) {
            for (int i = 0; i < size; i++) {
                Property property = properties[i];
                if (property.getId() == id) {
                    if (i < size - 1) {
                        System.arraycopy(properties, i + 1, properties, i, size - i - 1);
                    }
                    properties[--size] = null;
                    break;
                }
            }
        }
    }

