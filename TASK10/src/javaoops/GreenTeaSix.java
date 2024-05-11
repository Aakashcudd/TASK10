package javaoops;

public class GreenTeaSix extends TeaSix{

	@Override
    public void prepareTea() {
        boilWater();
        steepGreenTeaBag();
        pourInCup();
        addLemonOrMilk();
    }

    private void steepGreenTeaBag() {
        System.out.println("Steeping green tea bag");
    }
}

	

