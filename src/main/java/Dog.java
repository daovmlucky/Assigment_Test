import behavior.SingBehavior;
import behavior.WalkBehavior;

public class Dog extends Animal{

	public Dog(SingBehavior sb, WalkBehavior wb) {
		super(null,sb, wb);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		if(this.walkBehavior != null) {
			this.walkBehavior.walk();
		}
	}

	@Override
	public void fly() {
		if(this.flyBehavior != null) {
			this.flyBehavior.fly();
		}
	}

	@Override
	public String sing() {
		if(this.singBehavior != null) {
			return this.singBehavior.sing();
		}
		return null;
	}

}
