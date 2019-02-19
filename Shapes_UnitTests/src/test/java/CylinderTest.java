package test.java;

import edu.cvtc.java.Cylinder;
import static org.junit.Assert.*;


import org.junit.*;

public class CylinderTest {
	
	MessageBoxSub MessageSub = new MessageBoxSub();
	Cylinder Cylind = new Cylinder(MessageSub);
	
	


	@Test
	public void testSurfaceArea1() {
		Cylind.setHeight(15f);
		Cylind.setRadius(5f);
		
		float actual = Cylind.surfaceArea();
		float expected = 628.32f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test
	public void testSurfaceArea2() {
		Cylind.setHeight(25.5f);
		Cylind.setRadius(5f);
		
		float actual = Cylind.surfaceArea();
		float expected = 958.19f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test
	public void testSurfaceArea3() {
		Cylind.setHeight(11f);
		Cylind.setRadius(11f);
		
		float actual = Cylind.surfaceArea();
		float expected = 1520.53f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test(expected = Error.class) //Error due to invalid letter instead of number
	public void testSurfaceAreaLetter() {
		Cylind.setHeight(F);
		Cylind.setRadius(11f);
		
		float actual = Cylind.surfaceArea();
		float expected = 1520.53f;
		
		assertEquals(expected, actual, 0.01f);
	}

	@Test
	public void testVolume1() {
		Cylind.setHeight(15);
		Cylind.setRadius(5);
		
		float actual = Cylind.volume();
		float expected = 1178.1f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test
	public void testVolume2() {
		Cylind.setHeight(25.5f);
		Cylind.setRadius(5f);
		
		float actual = Cylind.volume();
		float expected = 2002.77f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test
	public void testVolume3() {
		Cylind.setHeight(11f);
		Cylind.setRadius(11f);
		
		float actual = Cylind.volume();
		float expected = 4181.46f;
		
		assertEquals(expected, actual, 0.01f);
	}
	
	@Test(expected = Error.class)  //Error due to non float number
	public void testVolumeNonFloat() {
		Cylind.setHeight(25.5);
		Cylind.setRadius(5f);
		
		float actual = Cylind.volume();
		float expected = 2002.77f;
		
		assertEquals(expected, actual, 0.01f);
	}

	@Test
	public void testCylinder() {
		assertNotNull(Cylind);
	}

	@Test
	public void testGetRadius() {
		Cylind.setHeight(15);
		Cylind.setRadius(5);
		
		float actual = Cylind.getHeight();
		float expected = 15f;
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testGetHeight() {
		Cylind.setHeight(15);
		Cylind.setRadius(5);
		
		float actual = Cylind.getRadius();
		float expected = 5f;
		
		assertEquals(expected, actual, 0);
	}

}
