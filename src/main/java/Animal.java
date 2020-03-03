import behavior.FlyBehavior;
import behavior.SingBehavior;
import behavior.WalkBehavior;

public class Animal {
	
	protected FlyBehavior flyBehavior;
	protected SingBehavior singBehavior;
	protected WalkBehavior walkBehavior;
	
	public Animal(FlyBehavior fb,SingBehavior sb,WalkBehavior wb) {
		this.flyBehavior = fb;
		this.singBehavior = sb;
		this.walkBehavior = wb;
	}
	
	public void walk() {
		if(this.walkBehavior != null) {
			this.walkBehavior.walk();
		}
	}

	public void fly() {
		if(this.flyBehavior != null) {
			this.flyBehavior.fly();
		}
	}

	public String sing() {
		if(this.singBehavior != null) {
			return this.singBehavior.sing();
		}
		return null;
	}
	
}
