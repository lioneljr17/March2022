import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CarTests {
	private Car Car;

	@BeforeClass
	public void setup() {
		String model = "Corvette";
		LargeEngine engine = new LargeEngine();
		ElectronicIgnition ignitionSystem = new ElectronicIgnition();

		this.Car = new ConvertibleCar(model, engine, ignitionSystem);
	}

	@Test
	public void canBuildCar() {
		Car car = this.Car;

		String actualModel = car.getModel();

		assertEquals(actualModel, Car.getModel() , "both should the same car model");
	}

	@Test
	public void canStartCar() {
		Car car = this.Car;
		Car.start();

		boolean isStarted = car.getIsStarted();

		assertTrue(isStarted, "manage to get it start");
	}
}
