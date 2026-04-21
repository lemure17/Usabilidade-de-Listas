package entities;


public class Employee {

	private Integer id;
	private String name;
	private double salary;
	
	
	public Employee(Integer id, String name, double salary) { //construtor padrão
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {			//getter e setter padrão para toda a classe
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	
	
	
	
	
}
