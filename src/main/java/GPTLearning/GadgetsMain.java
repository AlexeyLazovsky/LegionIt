package GPTLearning;

public class GadgetsMain {
    public static void main(String[] args) {
        Gadget smartphone = new Gadget("Smartphone", 1, "Mobile");
        smartphone.powerOn();
        smartphone.performGadgetAction("Make a call");
        smartphone.powerOff();

        Gadget laptop = new Gadget("Laptop", 2, "Computing");
        laptop.powerOn();
        laptop.performGadgetAction("Browse the internet");
        laptop.powerOff();
    }
}