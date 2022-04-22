public class Car extends MotorizedVehicle implements IEngine {
	private int odometer;
	
	public Car(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
		
	}
	
	public int getOdometer() {
		return odometer;
	}
	public int getCylinderCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
}
