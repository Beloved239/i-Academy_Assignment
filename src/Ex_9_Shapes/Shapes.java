package Ex_9_Shapes;

public class Shapes {
    private String nameOfObject;

    public Shapes(String nameOfObject) {
        this.nameOfObject = nameOfObject;
    }

    public String getNameOfObject() {
        return nameOfObject;
    }

    public void setNameOfObject(String nameOfObject) {
        this.nameOfObject = nameOfObject;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "nameOfObject='" + nameOfObject + '\'' +
                '}';
    }
}
