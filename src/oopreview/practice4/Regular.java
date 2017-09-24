package oopreview.practice4;

public class Regular implements EmployeeType {
	private double prevSalary;
	public Regular(){
		this.prevSalary = 0;
	}
	public Regular(double prevSalary){
		this.prevSalary = prevSalary;
	}
	
	@Override
	public double getPrevSalary() {
		return this.prevSalary;
	}
	
	@Override
	public void setPrevSalary(double prevSalary) {
		this.prevSalary = prevSalary;
	}
	
	@Override
	public double increaseSalary(double salary, double rate) {
		this.prevSalary = salary;
		return salary * rate;
	}
}
