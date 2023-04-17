package GPTLearning;



public class Gadget {
    private String gadgetName;
    private int gadgetId;
    private String gadgetCategory;

    public Gadget(String gadgetName, int gadgetId, String gadgetCategory) {
        this.gadgetName = gadgetName;
        this.gadgetId = gadgetId;
        this.gadgetCategory = gadgetCategory;
    }

    public Gadget() {

    }

    public String getGadgetName() {
        return gadgetName;
    }

    public void setGadgetName(String gadgetName) {
        this.gadgetName = gadgetName;
    }

    public int getGadgetId() {
        return gadgetId;
    }

    public void setGadgetId(int gadgetId) {
        this.gadgetId = gadgetId;
    }

    public String getGadgetCategory() {
        return gadgetCategory;
    }

    public void setGadgetCategory(String gadgetCategory) {
        this.gadgetCategory = gadgetCategory;
    }

    public void powerOn() {
        System.out.println(String.format("Gadget %s was powered on", gadgetName));
    }

    public void powerOff() {
        System.out.println(String.format("Gadget %s was powered off", gadgetName));
    }

    public void performGadgetAction(String actionName) {
        System.out.println(String.format("%s action was performed on gadget %s", actionName, gadgetName));
    }
}