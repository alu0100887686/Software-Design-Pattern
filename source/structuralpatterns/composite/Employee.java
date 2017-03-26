package structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
   private String name;
   private String dept;
   private int salary;
   private List<Employee> subordinates;

   // constructor
   public Employee(String name,String dept, int sal) {
      this.name = name;
      this.dept = dept;
      this.salary = sal;
      subordinates = new ArrayList<Employee>();
   }
   
   // add subordinate
   public void add(Employee e) {
      subordinates.add(e);
   }
   
   // remove subordinate
   public void remove(Employee e) {
      subordinates.remove(e);
   }
   
   // get list of subordinates
   public List<Employee> getSubordinates(){
     return subordinates;
   }

   public String toString(){
      return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]\n" 
      		+ allSubordinates());
   }
   
   // get the subordinates hierarchy
   public String allSubordinates(){
  	 String result = "";
  	 for (Employee headEmployee : getSubordinates())
  		 result += headEmployee.toString();
  	 return result;		 
  } 
}