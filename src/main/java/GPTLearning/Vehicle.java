package GPTLearning;

public class Vehicle {




    private String vehicleName;
    private int vehicleId;
    private String vehicleType;

    public Vehicle () {

    }

    public Vehicle (String vehicleName, int vehicleId, String vehicleType){
        this.vehicleName=vehicleName;
        this.vehicleId=vehicleId;
        this.vehicleType= vehicleType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }



public void startEngine(){
    System.out.println(String.format("The engine of %s was started",vehicleName));
}


    public void stopEngine() {
        System.out.println(String.format("The engine of %s was stopped", vehicleName));

    }

    public void performVehicleAction(String actionName) {
        System.out.println(String.format("%s  action was conducted", actionName));

    }




}
