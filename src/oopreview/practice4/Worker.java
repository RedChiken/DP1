package oopreview.practice4;

public abstract class Worker {

   private EmployeeType employeeType;
   private double salary;
   
   public abstract void doWork();   
    // fill necessary fields
    
    public double getSalary() { 
        return salary;
   }
    
    public void setSalary(double salary) {
        employeeType.setPrevSalary(this.salary);
        this.salary = salary;
    }

    public void increaseSalary(double rate) {
        salary = employeeType.increaseSalary(this.salary, rate);
    }
    
    public void setEmployeeType(EmployeeType emptype) {
        this.employeeType = emptype;
    }
    
    public EmployeeType getEmpoyeeType() {
        return employeeType;
    }
   
}
