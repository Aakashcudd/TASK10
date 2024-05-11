package javaoops;

public class Tea {

		    private boolean isPrepared;
		    private boolean hasMilk;
		    private boolean hasSugar;

		    public Tea() {
		        this.isPrepared = false;
		        this.hasMilk = false;
		        this.hasSugar = false;
		    }

		    public void prepareTea() {
		        System.out.println("Preparing basic tea with hot water and tea leaves.");
		        this.isPrepared = true;
		    }

		    public void addMilk() {
		        if (!isPrepared) {
		            System.out.println("Please prepare the tea first.");
		            return;
		        }
		        System.out.println("Adding milk to the basic tea.");
		        this.hasMilk = true;
		    }

		    public void addSugar() {
		        if (!isPrepared) {
		            System.out.println("Please prepare the tea first.");
		            return;
		        }
		        System.out.println("Adding sugar to the basic tea.");
		        this.hasSugar = true;
		    }

		    public static void main(String[] args) {
		        Tea myTea = new Tea();
		        myTea.prepareTea();
		        myTea.addMilk();
		        myTea.addSugar();
		    }

			public void addLemonOrMilk() {
				// TODO Auto-generated method stub
				
			}

			public void brew() {
				// TODO Auto-generated method stub
				
			}

	}


