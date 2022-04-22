import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConvertibleCarTests    {
	private ConvertibleCar Car;

	@BeforeClass
	public void setup() {
		String model = "Miata";
		IEngine engine = new SmallEngine();
		IIgnition ignitionSystem = new ElectronicIgnition();
		
		this.Car = new ConvertibleCar(model, engine, ignitionSystem);
	}

	@Test
	public void canBuildConvertibleCar() {
		ConvertibleCar car = this.Car;

		String actualModel = car.getModel();

		assertEquals(actualModel, Car.getModel() , "both should the same car model");
	}

	@Test
	public void canStartConvertibleCar() {
		ConvertibleCar car = this.Car;
		car.start();
		boolean isStarted = car.getIsStarted();

		assertTrue(isStarted, "manage to get it start");
	}

	@Test
	public void canLowerTop() {
		ConvertibleCar car = this.Car;
		car.TopIsUp();
		System.out.println("if top is up than top can be lowed");
	}

	@Test
	public void canRaiseTop() {
		ConvertibleCar car = this.Car;
		car.TopIsdown();
		System.out.println("if top is down than top can be raise");
	}

	
}
