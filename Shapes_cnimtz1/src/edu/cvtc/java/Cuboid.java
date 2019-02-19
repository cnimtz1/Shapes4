package edu.cvtc.java;


/**
 * @author Chris Nimtz
 *
 */
//Cuboid class that is a sub class of Shape
public class Cuboid extends Shape implements Renderer{

	//Attributes
	private float width;
	private float height;
	private float depth;
	
	//Default Constructor
	public Cuboid(Dialog _messageBox) {
		super(_messageBox);
		setWidth(0.0f);
		setHeight(0.0f);
		setDepth(0.0f);
	}
	
	public Cuboid(Dialog _messageBox, float wid, float high, float dep) {
		super(_messageBox);
		setWidth(wid);
		setHeight(high);
		setDepth(dep);
	}

	//Get and Set Width, accessors set to public
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}

	//Get and Set Height, accessors set to public
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}

	//Get and Set Depth, accessors set to public
	public float getDepth() {
		return depth;
	}
	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	//Surface area override for cuboid, SA=2lw+2lh+2hw
	@Override
	public float surfaceArea() {
		if (height <= 0.0f || depth <= 0.0f || width <= 0.0f) {//if a negative, set area to 0
			return 0;
		} else { 
			return 2*(height*width) + 2*(width*depth) + 2*(height*depth);
		}
		
	}
	
	//Volume override for cuboid, V=d*w*h
	@Override
	public float volume() {
		if (height <= 0.0f || depth <= 0.0f || width <= 0.0f) {//if a negative, set area to 0
			return 0;
		} else { //Display values for message box
			return depth*width*height;
		}
		
		
	}
	
	//render() for Cuboid message box
	@Override
	public void render() {
		//If check to generate error if values are negative or 0
		if (height <= 0.0f || depth <= 0.0f || width <= 0.0f) {
			getMessageBox().show("Dimensions can not be 0 or negative", "Geometry Error");
		} else { //Display values for message box
			getMessageBox().show("Height is " + height + ", Width is " + width 
					+ ", Depth is " + depth + ", Surface Area is " 
					+ surfaceArea() + " and the Volume is " + volume(),
					"Cuboid Stats");
		
		}
	}
	
}
