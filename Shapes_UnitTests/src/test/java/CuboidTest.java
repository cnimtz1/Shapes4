package test.java;
import edu.cvtc.java.Dialog;
import edu.cvtc.java.Cuboid;
import static org.junit.Assert.*;


import org.junit.*;


public class CuboidTest {

	MessageBoxSub MessageSub = new MessageBoxSub();
	Cuboid Cube = new Cuboid(MessageSub);
	
	@Test
	public void testCube() {
		assertNotNull(Cube);
	}
	
	@Test
	public void testSurfaceArea1() {
		Cube.setDepth(10f);
		Cube.setHeight(15f);
		Cube.setWidth(12f);
		float actual = Cube.surfaceArea();
		float expected = 900f;
		
		assertEquals(expected, actual, 0.001f);
	}
	
	@Test
	public void testSurfaceArea2() {
		Cube.setDepth(20f);
		Cube.setHeight(25f);
		Cube.setWidth(30f);
		float actual = Cube.surfaceArea();
		float expected = 3700;
		
		assertEquals(expected, actual, 0.001f);
	}
	
	@Test
	public void testSurfaceArea3() {
		Cube.setDepth(0f);
		Cube.setHeight(-1f);
		Cube.setWidth(12f);
		float actual = Cube.surfaceArea();
		float expected = 0f;//Should default to impossible SA of 0
		
		assertEquals(expected, actual, 0.001f);
	}
	
	@Test(expected = Error.class) //Error due to a letter instead of a number
	public void testSurfaceAreaLetter() {
		Cube.setDepth(f);
		Cube.setHeight(25f);
		Cube.setWidth(30f);
		float actual = Cube.surfaceArea();
		float expected = 3700;
		
		assertEquals(expected, actual, 0.001f);
	}

	@Test
	public void testVolume1() {
		Cube.setDepth(10f);
		Cube.setHeight(15f);
		Cube.setWidth(12f);
		float actual = Cube.volume();
		float expected = 1800f;
		
		assertEquals(expected, actual, 0.001f);
	}
	
	@Test
	public void testVolume2() {
		Cube.setDepth(20f);
		Cube.setHeight(25f);
		Cube.setWidth(30f);
		float actual = Cube.volume();
		float expected = 15000;
		
		assertEquals(expected, actual, 0.001f);
	}
	
	@Test
	public void testVolume3() {
		Cube.setDepth(0f);
		Cube.setHeight(-1f);
		Cube.setWidth(12f);
		float actual = Cube.surfaceArea();
		float expected = 0f;//Should default to impossible Volume of 0
		
		assertEquals(expected, actual, 0.001f);
	}
	
	@Test
	public void testVolumeNegative() {
		Cube.setDepth(-20f);
		Cube.setHeight(25f);
		Cube.setWidth(30f);
		float actual = Cube.volume();
		float expected = 0; //Zero due impossiblity of negative depth
		
		assertEquals(expected, actual, 0.001f);
	}
	
	@Test(expected = Error.class)  //Error due to non float numbers
	public void testVolumeNonFloat() {
		Cuboid Cube = new Cuboid(MessageSub);
		Cube.setDepth(5);
		Cube.setHeight(1.5);
		Cube.setWidth(12f);
		float actual = Cube.surfaceArea();
		float expected = 90f;
		
		assertEquals(expected, actual, 0.001f);
	}
	

	@Test
	public void testGetWidth() {
		Cube.setDepth(10f);
		Cube.setHeight(15f);
		Cube.setWidth(12f);
		float actual = Cube.getWidth();
		float expected = 12f;
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testGetHeight() {
		Cube.setDepth(10f);
		Cube.setHeight(15f);
		Cube.setWidth(12f);
		float actual = Cube.getHeight();
		float expected = 15f;
		
		assertEquals(expected, actual, 0);
	}

	@Test
	public void testGetDepth() {
		Cube.setDepth(10f);
		Cube.setHeight(15f);
		Cube.setWidth(12f);
		float actual = Cube.getDepth();
		float expected = 10f;
		
		assertEquals(expected, actual, 0);
	}

}
