import behavior.FlyBehavior;
import behavior.SingBehavior;
import behavior.SwimBehavior;
import behavior.WalkBehavior;

public class Duck extends Bird{

	private SwimBehavior swimBehavior;
	
	public Duck(FlyBehavior fb, SingBehavior sb, WalkBehavior wb,SwimBehavior swb) {
		super(fb, sb, wb);
		this.swimBehavior = swb;
	}
	
	public void swim() {
		if(this.swimBehavior != null) {
			this.swimBehavior.swim();
		}
	}

}
