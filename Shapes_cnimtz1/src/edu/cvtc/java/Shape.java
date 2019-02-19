package edu.cvtc.java;

/**
 * @author Chris Nimtz
 *
 */
//Shape is the super class for Cuboid, Cylinder and Sphere subclasses
public abstract class Shape {

	//Dialog injection
	private Dialog messageBox;
	
	protected Dialog getMessageBox() {
		return messageBox;
	}
	
	@SuppressWarnings("unused")
	private void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	


	
	public Shape(Dialog _messageBox) {
		this.messageBox = _messageBox;
		messageBox.show("Test message", "Test Title");
	}
	

	
	//Constant for pi as a float number
	public float PI = (float) Math.PI;
	
	//Abstracts for Surface area, volume and render
	public abstract float surfaceArea();
	public abstract float volume();
	protected abstract void render();
	
	
	
	
}
