package javaoops;

public class BlackTea extends TeaForQuestion7{
	public BlackTea(String name) {
        super(name);
    }

    @Override
    public void brew() {
        System.out.println("Brewing black tea: " + getName());
    }
}
