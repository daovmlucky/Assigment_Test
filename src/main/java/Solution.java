import behavior.DefaultBehaivorFlying;
import behavior.DefaultBehaviorSinging;
import behavior.DefaultBehaviorWalking;
import behavior.DogSinging;
import behavior.CatSinging;
import behavior.ChickenSinging;
import behavior.DuckSinging;
import behavior.DuckSwimming;
import behavior.RoosterSinging;


public class Solution {

	public static void main(String[] args) {
		Bird bird = new Bird(new DefaultBehaivorFlying(),new DefaultBehaviorSinging(),new DefaultBehaviorWalking());
		System.out.println(bird.sing());
		
		Duck duck = new Duck(new DefaultBehaivorFlying(), new DuckSinging(), new DefaultBehaviorWalking(), new DuckSwimming());
		duck.walk();
		duck.swim();
		duck.fly();
		System.out.println(duck.sing());
		
		Chicken chicken = new Chicken(new ChickenSinging(), new DefaultBehaviorWalking());
		chicken.walk();
		chicken.fly();
		System.out.println(chicken.sing());
		
		Rooster rooster = new Rooster(new RoosterSinging(), new DefaultBehaviorWalking());
		rooster.walk();
		rooster.fly();
		System.out.println(rooster.sing());
		
		Dog dog = new Dog(new DogSinging(), new DefaultBehaviorWalking());
		Cat cat = new Cat(new CatSinging(), new DefaultBehaviorWalking());
		
		Parrot parrot = new Parrot(new DefaultBehaivorFlying(),new DefaultBehaviorSinging(),new DefaultBehaviorWalking());
		System.out.println(parrot.sing(dog));
		
		Parrot parrot1 = new Parrot(new DefaultBehaivorFlying(),new DefaultBehaviorSinging(),new DefaultBehaviorWalking());
		System.out.println(parrot1.sing(cat));
		
		Parrot parrot2 = new Parrot(new DefaultBehaivorFlying(),new DefaultBehaviorSinging(),new DefaultBehaviorWalking());
		System.out.println(parrot2.sing(rooster));

	}

}
