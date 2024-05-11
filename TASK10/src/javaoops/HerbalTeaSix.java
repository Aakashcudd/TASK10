package javaoops;

public class HerbalTeaSix extends TeaSix{

	  public void prepareTea() {
	        boilWater();
	        steepHerbalTeaBag();
	        pourInCup();
	        addLemonOrMilk(); // Herbal tea might not need milk or lemon
	    }

	    private void steepHerbalTeaBag() {
	        System.out.println("Steeping herbal tea bag");
	    }

@Override
public void addLemonOrMilk() {
    System.out.println("Herbal tea does not need milk or lemon");

}
}