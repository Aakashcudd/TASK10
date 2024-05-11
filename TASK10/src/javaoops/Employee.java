package javaoops;

public class Employee {

	
		
		    private int id;
		    private String firstName;
		    private String lastName;
		    private int salary;

		    public Employee(int id, String firstName, String lastName, int salary) {
		        this.id = id;
		        this.firstName = firstName;
		        this.lastName = lastName;
		        this.salary = salary;
		    }

		    public int getId() {
		        return id;
		    }

		    public String getFirstName() {
		        return firstName;
		    }

		    public String getLastName() {
		        return lastName;
		    }

		    public String getName() {
		        return firstName + " " + lastName;
		    }

		    public int getSalary() {
		        return salary;
		    }

		    public void setSalary(int salary) {
		        this.salary = salary;
		    }

		    public int getAnnualSalary() {
		        return salary * 12;
		    }

		    public void raiseSalary(int percent) {
		        double raiseFactor = (100 + percent) / 100.0;
		        this.salary = (int) (this.salary * raiseFactor);
		    }

		    @Override
		    public String toString() {
		        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
		    }

		    public static void main(String[] args) {
		        Employee emp = new Employee(1, "John", "Doe", 50000);
		        System.out.println(emp);

		        emp.raiseSalary(10);
		        System.out.println(emp.getSalary());

		        System.out.println(emp.getAnnualSalary());
		    }
		
	}


