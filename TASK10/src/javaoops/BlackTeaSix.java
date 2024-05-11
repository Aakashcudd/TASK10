package javaoops;

public class BlackTeaSix extends TeaSix {


	    @Override
	    public void prepareTea() {
	        boilWater();
	        steepBlackTeaBag();
	        pourInCup();
	        addLemonOrMilk();
	    }

	    private void steepBlackTeaBag() {
	        System.out.println("Steeping black tea bag");
	    }
	}

