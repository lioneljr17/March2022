public class ConvertibleCar extends Car implements ICar {
	boolean TopIsLowed;
	boolean TopIsRaised;
	public ConvertibleCar(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
		
	}
	public void top() {
		this.TopIsRaised = true;		
	}

	
	public boolean TopIsUp() {
		
		return this.TopIsRaised;
	}
}
