
public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private int employeeAge;
    private String designation;

public Employee() {}
public Employee(int employeeId,String employeeName,double salary,int employeeAge,String designation ) {
    this.employeeId=employeeId;
    this.employeeName=employeeName;
    this.salary=salary;
    this.employeeAge=employeeAge;
    this.employeeId=employeeId;
    this.designation=designation;    
}
public int getEmployeeId() {
    return employeeId;
}
public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
}
public String getEmployeeName() {
    return employeeName;
}
public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
}
public double getSalary() {
    return salary;
}
public void setSalary(double salary) {
    this.salary = salary;
}
public int getEmployeeAge() {
    return employeeAge;
}
public void setEmployeeAge(int employeeAge) {
    this.employeeAge = employeeAge;
}
public String getDesignation() {
    return designation;
}
public void setDesignation(String designation) {
    this.designation = designation;
}
@Override
public String toString() {
    return "Employee [employeeId=" + employeeId +", employeeName=" +employeeName+", salary=" +salary+" employeeAge=" +employeeAge+", designation=" + designation +"]";
}
}