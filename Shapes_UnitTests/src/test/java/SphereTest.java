package test.java;


import edu.cvtc.java.Sphere;
import static org.junit.Assert.*;

import org.junit.*;

public class SphereTest {

	MessageBoxSub MessageSub = new MessageBoxSub();
	Sphere Spheroid = new Sphere(MessageSub);
	
	@Test
	public void testSurfaceArea1() {
		Spheroid.setRadius(10);
		
		float actual = Spheroid.surfaceArea();
		float expected = 1256.64f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test
	public void testSurfaceArea2() {
		Spheroid.setRadius(17f);
		
		float actual = Spheroid.surfaceArea();
		float expected = 3631.68f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test
	public void testSurfaceArea3() {
		Spheroid.setRadius(3.5f);
		
		float actual = Spheroid.surfaceArea();
		float expected = 153.94f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test(expected = Error.class) //Error due to a letter instead of fload number
	public void testSurfaceAreaLetter() {
		Spheroid.setRadius(f);
		
		float actual = Spheroid.surfaceArea();
		float expected = 0f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test
	public void testNegativeRadiusSurfaceArea() {
		Spheroid.setRadius(-3.5f);
		
		float actual = Spheroid.surfaceArea();
		float expected = 0f;//Should default to impossible Surface Area of 0
		
		assertEquals(expected, actual, 0.01f);
	}

	@Test
	public void testVolume1() {
		Spheroid.setRadius(10f);
		
		float actual = Spheroid.volume();
		float expected = 4188.79f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test
	public void testVolume2() {
		Spheroid.setRadius(17);
		
		float actual = Spheroid.volume();
		float expected = 20579.53f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test
	public void testVolume3() {
		Spheroid.setRadius(3.5f);
		
		float actual = Spheroid.volume();
		float expected = 179.59f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test(expected = Error.class)  //Error due to non float number
	public void testNonFloatVolume() {
		Spheroid.setRadius(3.5);
		
		float actual = Spheroid.volume();
		float expected = 179.59f;
		
		assertEquals(expected, actual, 0.01f);
	}

	@Test
	public void testSphere() {
		assertNotNull(Spheroid);
	}

	@Test
	public void testGetRadius() {
		Spheroid.setRadius(10);
		
		float actual = Spheroid.getRadius();
		float expected = 10f;
		
		assertEquals(expected, actual, 0);
	}

}
