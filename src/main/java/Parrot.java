import behavior.FlyBehavior;
import behavior.SingBehavior;
import behavior.WalkBehavior;

public class Parrot extends Bird{

	public Parrot(FlyBehavior fb, SingBehavior sb, WalkBehavior wb) {
		super(fb, sb, wb);
		// TODO Auto-generated constructor stub
	}
	
	public String sing(Object obj) {
		if(obj == null) {
			return null;
		}else if(obj instanceof Animal){
			return ((Animal)obj).sing();
		}
		return null;
	}

}
