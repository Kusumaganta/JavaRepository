import java.util.ArrayList;
import java.util.List;

public class Source {

	public static void main(String[] args) {
		List<Employee> lsttemp=new ArrayList<Employee>();
        Employee emp1=new Employee(101, "Alekhya",23000,21,"Developer");
        lsttemp.add(emp1);
        lsttemp.add(new Employee(102,"Navya",21000,19,"Java Developer"));
        lsttemp.add(new Employee(103,"Anusha",25000,24,"Sr Developer"));
        lsttemp.add(new Employee(104,"Varshitha",26000,20,"Team Leader"));
        for(Employee employee: lsttemp)
            System.out.println(employee);

 


	}

}

