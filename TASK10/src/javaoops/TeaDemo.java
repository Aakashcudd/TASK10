package javaoops;

public class TeaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeaForQuestion7[] teas = new TeaForQuestion7[3];
        teas[0] = new BlackTea("Earl Grey");
        teas[1] = new GreenTea("Jasmine");
        teas[2] = new HerbalTea("Chamomile");

        for (TeaForQuestion7 tea : teas) {
            tea.brew();
        }
    }
	}


