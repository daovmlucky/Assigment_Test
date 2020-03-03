
import behavior.SwimBehavior;


public class Fish extends Animal{

	SwimBehavior swimBehavior;
	String size;
	String color;
	String feature;

	
	public Fish(SwimBehavior swb,String size,String color,String feature) {
		super(null,null,null);
		this.swimBehavior = swb;
		this.size = size;
		this.color = color;
		this.feature = feature;
		// TODO Auto-generated constructor stub
	}

	public void swim() {
		if(this.swimBehavior != null) {
			this.swimBehavior.swim();
		}
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	
	

}
