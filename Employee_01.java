package Employee;

import java.util.Arrays;
import java.util.List;

public class Employee_01 {
	public static void main(String[] args) {
		List<Employee> table = Arrays.asList(
				new Employee(01, "Lakshika Vanaguru", 0023, "IT Department", 25000.00, "12-21-2022"),
				new Employee(02, "Aruna Silva", 0021, "HR Department", 30000.00, "09-23-2021"),
				new Employee(03, "Dilshan Samarawickrama", 0020, "Marketing Department", 45000.00, "10-22-2023"),
				new Employee(04, "Sanasha Herath", 0023, "IT Department", 30000.00, "02-20-2019"),
				new Employee(05, "Sasaara Dilmini", 0024, "Sales Department", 20000.00, "03-02-2020"),
				new Employee(06, "Amila Premarathne", 0023, "IT Department", 50000.00, "05-20-2018"));
		
		table.forEach(x -> System.out.println(x));
	}
}
