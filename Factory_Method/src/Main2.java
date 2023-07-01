import resource.Vehicle;

public class Main2 {

    public static void main(String[] args) {

        Vehicle car=Factory.getInstance().getVehicle(VehicleType.CAR);
        Vehicle bus=Factory.getInstance().getVehicle(VehicleType.BUS);
        Vehicle van=Factory.getInstance().getVehicle(VehicleType.VAN);


    }
}
