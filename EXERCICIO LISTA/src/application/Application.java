package application;
import java.util.ArrayList;
import  java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;



public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos funcionários serão registrados?");
		
		int choice = scanner.nextInt();
		
		
		
		List<Employee> employees = new ArrayList<>();
		
		for(int i=0; i< choice; i++) { // vetor para registro dos funcionários na lista employee
			
			System.out.println("Employee #" + (i + 1));
			
			System.out.println("Id: ");
			Integer id = scanner.nextInt();
			
			System.out.println("Name: ");
			String name = scanner.next();
			
			System.out.println("Salary: ");
			double salary = scanner.nextDouble();
			
			employees.add(new Employee(id, name, salary)); //instanciar classe com todos os elementos da lista
		}
		
		
		System.out.print("Enter the employee id that will receive a salary increase: ");
		
		int searchId = scanner.nextInt(); //int de apoio para poder pesquisar a lista pelo ID
		
		Employee found = null; //declara o found como nulo para poder percorrer a lista
		
		for(Employee emp:employees) {
			
			if (emp.getId().equals(searchId)) {
				
				found = emp;
				break;
				
			}
			
		}
		
		if (found != null) {
			System.out.println("Funcionário: " + found.getName());
			found.setSalary(found.getSalary() * 1.10);
			System.out.println("Novo salário do " + found.getName() + "será: " + found.getSalary());
		}
		
		else {
			System.out.println("ID não encontrado.");
		}
		
		scanner.close();
	}

}
