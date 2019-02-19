/**
 * 
 */
package test.java;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



import edu.cvtc.java.Cuboid;
import edu.cvtc.java.Cylinder;
import edu.cvtc.java.Sphere;
import edu.cvtc.java.Dialog;
import static org.junit.Assert.*;


import org.junit.*;

/**
 * @author Chris Nimtz
 *
 */
//Class for testing of the shapes objects
public class ShapesTest {
	
	//Main Method
	public static void main(String[] args) {
		

		
		MessageBoxSub MessageSub = new MessageBoxSub();
		

		
		//Declaring Objects
		Cuboid Cube = new Cuboid(MessageSub);
		Cylinder Cylind = new Cylinder(MessageSub);
		Sphere Spheroid = new Sphere(MessageSub);
		
	
		
		
		//Cube parameters
		Cube.setDepth(10);
		Cube.setHeight(15);
		Cube.setWidth(12);
		
		
		
		//Cylind parameters
		Cylind.setHeight(15);
		Cylind.setRadius(5);
		
		//Speroid paramerters
		Spheroid.setRadius(10);
		
		//Create message boxes for each shape

		Cube.render(); //Expected SA = 900, Expected V = 1800
		Cylind.render();//Expected SA = ~628.32, Expected V = ~1178.1
		Spheroid.render();//Expected SA = ~1256.64, Expected V = ~4188.79
		

		
	}
	
	

}
