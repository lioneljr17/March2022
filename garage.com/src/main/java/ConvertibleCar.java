public class ConvertibleCar extends Car implements ICar {
	boolean TopCanBeLowed;
	boolean TopCanBeRaised;
	
	public ConvertibleCar(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
		
	}
	
	public void top() {
		this.TopCanBeLowed = true;	
	}
	
	public boolean TopIsUp() {
		return this.TopCanBeRaised;
	}
	
	public void TOP() {
		this.TopCanBeRaised = true;
		
	}
	public boolean TopIsdown() {	
		return this.TopCanBeLowed;
	}
}
