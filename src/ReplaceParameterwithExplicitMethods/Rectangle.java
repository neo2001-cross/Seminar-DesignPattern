package ReplaceParameterwithExplicitMethods;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void setValue(String name, int value) {
		if (name == "width") {
			this.width = value;
		}
		if (name == "height") {
			this.height = value;
		}
	}
	//In the function above it has been made to set value for two attributes but it's parameter list is too long
	//You can simplify it by separate it to two function that can set value independent
	//You don't need to worry about what is the name of the value has been use to set anymore it has been show in the name of the setter
	
	
	public void setWidth(int value) {
		this.width = value;
	}
	
	public void setHeight(int value) {
		this.height = value;
	}
}
