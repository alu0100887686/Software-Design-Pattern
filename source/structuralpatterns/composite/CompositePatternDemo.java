package structuralpatterns.composite;

public class CompositePatternDemo {
  
	public static void main(String[] args) {
  	// Employees
    Employee CEO = new Employee("John","CEO", 30000);
    Employee headSales = new Employee("Robert","Head Sales", 20000);
    Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
    Employee clerk1 = new Employee("Laura","Marketing", 10000);
    Employee clerk2 = new Employee("Bob","Marketing", 10000);
    Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
    Employee salesExecutive2 = new Employee("Rob","Sales", 10000);
    // John: root node
    // Robert and Michel are subordinates of John
    CEO.add(headSales); 
    CEO.add(headMarketing);
    // Richard and Rob are subordinates of Robert
    headSales.add(salesExecutive1); 
    headSales.add(salesExecutive2);
    // Laura and Bob are subordinates of Robert	
    headMarketing.add(clerk1);
    headMarketing.add(clerk2);
    // print all employees of the organization
    System.out.println(CEO); 
    // print Head Sales employees 
    System.out.println(headSales); 
    // print Head Marketing employees 
    System.out.println(headMarketing); 
	}
}
