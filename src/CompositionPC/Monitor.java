package CompositionPC;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nattiveResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nattiveResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nattiveResolution = nattiveResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " in color" + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNattiveResolution() {
        return nattiveResolution;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                ", nattiveResolution=" + nattiveResolution +
                '}';
    }
}
