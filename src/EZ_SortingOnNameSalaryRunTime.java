import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EZ_SortingOnNameSalaryRunTime {

    public static class Employee{
        private String name;
        private Integer salary;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Integer getSalary() {
            return salary;
        }
        public void setSalary(Integer salary) {
            this.salary = salary;
        }
    }

    public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2){
            return (int)e1.getSalary()-e2.getSalary();
        }
    };

    public static Comparator<Employee> nameComparator = new Comparator<Employee>(){
        @Override
        public int compare(Employee e1, Employee e2){
            return (int)e1.getName().compareTo(e2.getName());
        }
    };

    public  static void main(String args[]){
        List<Employee> employeeList = new ArrayList<>();
        Employee emp = new Employee();
        emp.setName("Mix");
        emp.setSalary(100);
        employeeList.add(emp);
        Employee emp1 = new Employee();
        emp1.setName("Ananya");
        emp1.setSalary(20);
        employeeList.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Hello");
        emp2.setSalary(15);
        employeeList.add(emp2);
        Collections.sort(employeeList,nameComparator);
        employeeList.forEach(employee->{
            System.out.print(employee.getName()+employee.getSalary()+ "  ");
        });

        System.out.println();
        Collections.sort(employeeList,salaryComparator);
        employeeList.forEach(employee->{
            System.out.print(employee.getName()+employee.getSalary()+ "  ");
        });
    }
}
