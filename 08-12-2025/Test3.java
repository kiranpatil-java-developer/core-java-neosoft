package stream;

import java.util.Arrays;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private String department;
	private double salary;

	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}

public class Test3 {
	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(new Employee(101, "Nilam", "IT", 60000),
				new Employee(102, "Riya", "HR", 45000), new Employee(103, "Suresh", "IT", 90000),
				new Employee(104, "Neha", "Finance", 75000), new Employee(105, "Kiran", "IT", 50000),
				new Employee(106, "Priya", "HR", 65000), new Employee(107, "Vikas", "Finance", 120000));

//		 Filter employees with salary > 50,000
//		List<Employee> collect = emp.stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList());
//		collect.forEach(System.out :: println);
		
//		Find the highest paid employee
//		Employee orElse = emp.stream().sorted(new Comparator<Employee>() {
//			@Override
//			public int compare(Employee e1, Employee e2) {
//
//				if (e1.getSalary() > e2.getSalary()) {
//					return -1;
//				} else if (e1.getSalary() < e2.getSalary()) {
//					return 1;
//				}
//				return 0;
//			}
//		}).findFirst().orElse(new Employee(0, "N/A", "N/A", 0));
//		System.out.println(orElse);
//		
//		Employee employee = emp.stream().max(new Comparator<Employee>() {
//			@Override
//			public int compare(Employee e1, Employee e2) {
//
//				if (e1.getSalary() < e2.getSalary()) {
//					return -1;
//				} else if (e1.getSalary() > e2.getSalary()) {
//					return 1;
//				}
//				return 0;
//			}
//		}).orElse(new Employee(0, "N/A", "N/A", 0));
//		System.out.println(employee);
		
//		Group employees by department
//		Map<String, Set<Integer>> collect = emp.stream().collect(
//				Collectors.groupingBy(e -> e.getDepartment(), Collectors.mapping(e -> e.getId(), Collectors.toSet())));
//		collect.forEach((k, v) -> System.out.println(k + "  " + v));
		
//		Count employees in each department
//		Map<String, Long> collect = emp.stream()
//				.collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));
//		collect.forEach((k, v) -> System.out.println(k + " " + v));
		
//		Sort employees by salary in descending order
//		List<Integer> collect = emp.stream().sorted(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee e1, Employee e2) {
//
//				if (e1.getSalary() < e2.getSalary()) {
//					return 1;
//				} else if (e1.getSalary() > e2.getSalary()) {
//					return -1;
//				}
//				return 0;
//			}
//		}).map(e -> e.getId()).collect(Collectors.toList());
//		collect.forEach(e -> System.out.print(e + ", "));
		
//		Find the average salary of all employees
//		Double collect = emp.stream().collect(Collectors.averagingDouble(Employee :: getSalary));
//		System.out.println(collect);
		
//		Check if any employee earns more than 1,00,000
//		Map<Boolean, List<Employee>> collect = emp.stream()
//				.collect(Collectors.partitioningBy(e -> e.getSalary() > 100000));
//		collect.forEach((k, v) -> System.out.println(k + " -> " + v));
		
//		boolean anyMatch = emp.stream().anyMatch(e -> e.getSalary() > 100000);
//		System.out.println(anyMatch);
		
//		Get names of employees who belong to IT department
//		List<String> collect = emp.stream().filter(e -> e.getDepartment().equalsIgnoreCase("IT")).map(e -> e.getName())
//				.collect(Collectors.toList());
//		System.out.println(collect);
		
//		Find the second highest salary employee
//		Employee employee = emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1)
//				.findFirst().get();
//		System.out.println(employee);
		
//		Convert the employee list into a Map (id → name)
		
//		Map<Integer, Set<String>> collect = emp.stream().collect(
//				Collectors.groupingBy(e -> e.getId(), Collectors.mapping(Employee::getName, Collectors.toSet())));
//		System.out.println(collect);
		
//		Map<Integer, String> collect = emp.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
//		System.out.println(collect);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
