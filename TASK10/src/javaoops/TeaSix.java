package javaoops;

public class TeaSix {
	
	    public void prepareTea() {
	        boilWater();
	        steepTeaBag();
	        pourInCup();
	        addLemonOrMilk(); // This method can be overridden by subclasses
	    }

	    protected void boilWater() {
	        System.out.println("Boiling water");
	    }

	    private void steepTeaBag() {
	        System.out.println("Steeping the tea bag");
	    }

	    protected void pourInCup() {
	        System.out.println("Pouring tea into cup");
	    }

	    public void addLemonOrMilk() {
	        System.out.println("Adding lemon or milk");
	    }
	}


