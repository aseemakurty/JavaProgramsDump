import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EZ_SortingOnSalaryCompileTime_Comparable {

    public static class Employee implements Comparable<Employee>{
        private String name;
        private Integer salary;

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public Integer getSalary() {
            return salary;
        }
        public void setSalary(Integer salary) {
            this.salary = salary;
        }

        @Override
        public int compareTo(Employee emp){
            return this.salary-emp.salary;
        }
    }

    public static void main(String args[]){
        List<Employee> employeeList = new ArrayList<>();
        Employee emp = new Employee();
        emp.setName("Ananya");
        emp.setSalary(20);

        Employee emp1 = new Employee();
        emp1.setName("Ananya");
        emp1.setSalary(20);
        employeeList.add(emp);
        employeeList.add(emp1);
        Collections.sort(employeeList);
        employeeList.forEach(employee -> {
            System.out.print(employee.getName()+employee.getSalary()+ "  ");
        });
    }
}
