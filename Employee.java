package Employee;

import java.text.SimpleDateFormat;

public class Employee implements Comparable<Employee> {
	private int emp_id;
	private String emp_name;
	private int dep_id;
	private String dep_name;
	private Double salary;
	private String joined_date;
	
	public Employee(int emp_id, String emp_name, int dep_id, String dep_name, Double salary, String joined_date)
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.dep_id = dep_id;
		this.dep_name = dep_name;
		this.salary = salary;
		this.joined_date = joined_date;
	}
	
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		return String.format("%-3d%-20s%-15s%10.2f%-15s", emp_id, emp_name, dep_id, dep_name, salary, dateFormat.format(joined_date));
	}
	
	public int getemp_id() {
		return emp_id;
	}
	
	public void setemp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	public String getemp_name() {
		return emp_name;
	}
	
	public void setemp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
	public int getdep_id() {
		return dep_id;
	}
	
	public void setdep_id(int dep_id) {
		this.dep_id = dep_id;
	}
	
	public String getdep_name() {
		return dep_name;
	}
	
	public void setdep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	
	public double getsalary() {
		return salary;
	}
	
	public void setsalary(double salary) {
		this.salary = salary;
	}
	
	public String getjoined_date() {
		return joined_date;
	}
	
	public void setjoined_date(String joined_date) {
		this.joined_date = joined_date;
	}

	@Override
	public int compareTo(Employee o) {
		return ((Integer) emp_id).compareTo(o.emp_id);
	}
}
