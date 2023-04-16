package CompositionPC;

public class PC {
    private Case thecase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case thecase, Monitor monitor, Motherboard motherboard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getThecase() {
        return thecase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    @Override
    public String toString() {
        return "PC{" +
                "thecase=" + thecase +
                ", monitor=" + monitor +
                ", motherboard=" + motherboard +
                '}';
    }
}
