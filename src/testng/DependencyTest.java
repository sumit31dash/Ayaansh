package testng;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

	
	@Test
	public void startCar() {
		System.out.println("car started");
		//if this startCar will fail all depending methods will not execute
		Assert.fail();
	}
	
	@Test(dependsOnMethods= {"startCar"})
	
	public void driveCar() {
		System.out.println("car driving");
	}
	
	@Test(dependsOnMethods= {"driveCar"})
	
	public void stopCar() {
		System.out.println("car stopped");
	}
	
	@Test(dependsOnMethods= {"driveCar","stopCar"})
	
	public void parkCar() {
		System.out.println("car parked");
	}
}
