//4.Write a program that would print the information (name, year of joining, salary, address) of three employees 
//by creating a class named 'Employee'. The output should be as follows:
//Name        Year of joining        Address
//Robert            1994                64C- WallsStreat
//Sam                2000                68D- WallsStreat
//John                1999                26B- WallsStreat
public class Employee {
private String name,address;
public Employee(String name, String address, int year, int salary) {
	super();
	this.name = name;
	this.address = address;
	this.year = year;
	this.salary = salary;
}


private int year,salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a=new Employee("Robert","64C- WallsStreat",1994,30000);
		Employee b=new Employee("Sam","68D- WallsStreat",2000,20000);
		Employee c=new Employee("John","26B- WallsStreat",1999,40000);
		 System.out.println("Name\tYear of joining\tSalary\tAddress");
		 System.out.println(a.name+"\t"+a.year+"\t\t"+a.salary+"\t"+a.address);
		 System.out.println(b.name+"\t"+b.year+"\t\t"+b.salary+"\t"+b.address);  
		 System.out.println(c.name+"\t"+c.year+"\t\t"+c.salary+"\t"+c.address);

	}

}
