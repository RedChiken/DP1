package oopreview.practice4;

public class Manager implements EmployeeType {
	private double prevSalary;
	
	public Manager(){
		this.prevSalary = 0;
	}
	public Manager(double prevSalary){
		this.prevSalary = prevSalary;
	}
	
	@Override
	public double getPrevSalary() {
		return prevSalary;
	}
	
	@Override
	public void setPrevSalary(double salary){
		this.prevSalary = salary;
	}
	
	@Override
	public double increaseSalary(double salary, double rate) {
		prevSalary = salary;
		return ((salary + 10) * rate);
	}
}
