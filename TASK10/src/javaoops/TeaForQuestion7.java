package javaoops;

public class TeaForQuestion7 {
	private String name;

public TeaForQuestion7(String name2) {
		// TODO Auto-generated constructor stub
	}

public void Tea(String name) {
    this.name = name;
}

public String getName() {
    return name;
}

public void brew() {
    System.out.println("Brewing " + name + " tea");
}
}
