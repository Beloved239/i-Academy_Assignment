package CompositionPC;

public class Main {
    public static void main(String[] args) {
        Case theCase = new Case("smart","Dell","Int",new Dimensions(12,23,20));
        Monitor theMonitor = new Monitor("14inch","HP",12,new Resolution(25,20));
        Motherboard theMotherboard = new Motherboard("123sa","Acer", 3,123,"v234");
        PC thePc = new PC(theCase,theMonitor,theMotherboard);
        System.out.println(thePc);
        thePc.getMonitor().drawPixelAt(23,21,"red");
        thePc.getMotherboard().loadProgram("Windows 2.0");
        thePc.getThecase().pressPowerButton();
    }
}
